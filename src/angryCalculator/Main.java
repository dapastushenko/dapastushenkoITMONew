package angryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String x;
        String y;

        Scanner str = new Scanner(System.in);
        System.out.printf("Input: %n");
        x=str.nextLine();
//        parse(x);
        y="x = 1";
//        String[] split = x.split(" ");
        try {
            //скрыть потом
            for ( String o: parse(x)){
                System.out.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static String[] parse(String val) throws Exception{
//        try
        String[] split = val.split(" ");
        return split;
    }
    public static void Accum(int x, int y, String acc){
        switch (acc){
            case "+":
                System.out.printf("x+y="+(x+y));
              break;
            case "-":
                System.out.printf("x-y="+(x-y));
                break;
            case "//":

                System.out.printf("x//y="+(x/y));
                break;
        }

    }

}
