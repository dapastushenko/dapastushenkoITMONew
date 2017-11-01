package Lesson2;

public class Task2_18 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 3; i < 50000; i++) {
            String s = String.valueOf(i);

            if (s.indexOf('2')!= -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
