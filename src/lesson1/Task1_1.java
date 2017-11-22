import java.util.Scanner;

public class Task1_1 {
    public static void main (String[] args){
       // int q = 21;
       // int w = 8;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательно два натуральных числа");
        int q = in.nextInt();
        int w = in.nextInt();
        System.out.println(q+"/"+w+"="+q/w+" и "+q%w+" в остатке");
    }
}
