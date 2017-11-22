package lesson8;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь к папке1:");
        String dir1 = in.nextLine();
        System.out.println("Введите путь к папке2:");
        String dir2 = in.nextLine();

        for (File filename : getFilesArray(dir1)) {
            System.out.println(filename.getName());
        }

    }


    public static ArrayList<File> getFilesArray(String dir) {
        ArrayList<File> fileNamesArray = new ArrayList<>();
        File file = new File(dir);
        for (File s : file.listFiles()) {
            if (s.isFile()) {
                fileNamesArray.add(s);
            } else if (s.isDirectory()) {
                getFilesArray(s.getAbsolutePath());
            }

        }
        return fileNamesArray;
    }
}
