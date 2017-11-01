import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательно три натуральных числа");
        int q = in.nextInt();
        int w = in.nextInt();
        int e = in.nextInt();
        int max = Math.max(q, w);
        if (max < e) {
            max = e;
        }
        if (max == q) {
            int mid = Math.max(w, e);
            if (mid == w) {
                System.out.println(e + "," + mid + "," + max);
            } else {
                System.out.println(w + "," + mid + "," + max);
            }

        } else if (max == w) {
            int mid = Math.max(q, e);
            if (mid == q) {
                System.out.println(e + "," + mid + "," + max);
            } else {
                System.out.println(q + "," + mid + "," + max);
            }
        } else if (max == e) {
            int mid = Math.max(q, w);
            if (mid == q) {
                System.out.println(w + "," + mid + "," + max);
            } else {
                System.out.println(q + "," + mid + "," + max);
            }
        }
    }
}
