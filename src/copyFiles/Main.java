package copyFiles;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        //     String filepath = in.nextLine();
        File src = new File("C:\\SUService.log");
        File dest = new File("D:\\111.txt");
        copy(src, dest);

    }

    private static void copy(File src, File dest) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dest)) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0)
                out.write(buf, 0, len);
        }
    }
    private void fileSplit(String fileName, int partCount) throws Exception {
        Path filePath = Paths.get(fileName);
        try (BufferedInputStream input =
                     new BufferedInputStream(Files.newInputStream(filePath))) {
            long size = Files.size(filePath);
            //сделать более хитрее
            byte[] buffer = new byte[1024];
            long partSize = size / partCount;
            for (int i = 0; i < partCount; i++) {
                String partFileName = fileName + "$" + i;
                try (OutputStream outputStream = Files.newOutputStream(Paths.get(partFileName));
                     BufferedOutputStream output = new BufferedOutputStream(outputStream)) {
                    int currentSize = 0;
                    while (currentSize < partSize) {
                        int byteCount = input.read(buffer);
                        output.write(buffer, 0, byteCount);
                        currentSize += byteCount;
                    }
                }
            }
        }
    }
}
