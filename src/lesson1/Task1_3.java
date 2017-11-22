import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число, с дробной частью>0");
        System.out.println("Результат: " + Math.round(in.nextDouble()));
    }
}
