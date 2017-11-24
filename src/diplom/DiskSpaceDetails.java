package diplom;
import java.io.File;

public class DiskSpaceDetails {
//    private static final String VOLUME = "c:";

    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for (File file: roots) {
            //    System.out.println(file.getAbsolutePath());

//        final File file = new File(VOLUME);

            long totalSpace = file.getTotalSpace();
            long freeSpace = file.getFreeSpace();
            long usableSpace = file.getUsableSpace();

            System.out.println("========== Раздел \"" + file.getAbsolutePath()
                    + "\" (байты) ==========");
            System.out.println("Totlal space (всего места): "
                    + totalSpace);
            System.out.println("Free space (свободное место): "
                    + freeSpace);
            System.out.println("Usable space (доступно для использования): "
                    + usableSpace);
            System.out.println("========== Раздел \"" + file.getAbsolutePath()
                    + "\" (мегабайты) ==========");
            System.out.println("Totlal space (всего места): "
                    + totalSpace / 1024 / 1024);
            System.out.println("Free space (свободное место): "
                    + freeSpace / 1024 / 1024);
            System.out.println("Usable space (доступно для использования): "
                    + usableSpace / 1024 / 1024);

        }
    }

}