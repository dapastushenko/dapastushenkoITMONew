import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число от 5 до 155");
        int n=in.nextInt();
        if (n<25 & n>100){
            System.out.println("Число "+n+"содержится в интервале (25,100)");
        }
        else{
            System.out.println("Число "+n+" не содержится в интервале (25,100)");
        }
    }
}
