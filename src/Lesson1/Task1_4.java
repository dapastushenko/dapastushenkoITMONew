import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите целое 3-хзначное число:");
        int q = in.nextInt();
        int n = q/100;
        int m = (q%100)/10;
        int b = (q%100)%10;
        System.out.println("Сумма цифр: "+(n+m+b));
    }
}
