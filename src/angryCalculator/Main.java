package angryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String x;
        String y;

        Scanner str = new Scanner(System.in);
        System.out.println("Введите значение переменной х");
        x=str.nextLine();
//        parse(x);
        y="x = 1";
        String[] split = y.split(" ");
        for ( String o: split){
            System.out.println(o);
        }


    }
//    public static String[] parse(String x) {

//        return;
//    }

}
