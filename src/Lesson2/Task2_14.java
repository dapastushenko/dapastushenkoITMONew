import java.util.Scanner;

public class Task2_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        out:
        for (int i = 1; i <= Math.abs(n); i++) {
            if ((Math.abs(n) % i == 0) & (i!=n) & (i!=1)) {
                System.out.println("Число не является натуральным");
                break out;

            }
            else if (i==Math.abs(n)){
                System.out.println("Число является натуральным");
            }

        }

    }
}
