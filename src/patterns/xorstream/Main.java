package patterns.xorstream;

import java.io.File;
import java.io.IOException;

import static patterns.xorstream.CryptoInputStream.files;

public class Main {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\SUService.log");
        File dest = new File("D:\\111.txt");
        files(src, dest);
    }
}
