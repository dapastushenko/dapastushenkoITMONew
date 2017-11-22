import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите двузначное натуральное число");
        int n = in.nextInt();
        int summ = n/10+n%10;
        System.out.println("Результат: "+summ);

    }
}
