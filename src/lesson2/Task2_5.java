package lesson2;

public class Task2_5 {
    public static void main(String[] args){

        int n = (int)(Math.random()*1000);
        System.out.println(n);
        String q = String.valueOf(n);
        char[] chArray=q.toCharArray();
        char x1 = chArray[0];
        char x2 = chArray[1];
        char x3 = chArray[2];
//      В числе 208 наибольшая цифра 8 В числе 774 наибольшая цифра 7
        int max, min, mid;

        int x11 =Character.digit(x1, 10);
        int x22 =Character.digit(x2, 10);
        int x33 =Character.digit(x3, 10);

         if (x11>x22 & x11>x33){
             System.out.println("В числе"+n+"наибольшая цифра"+x11);
         }
        else if ((x11>x22 & x11==x33)||(x11>x33 & x11==x22)){
            System.out.println("В числе"+n+"наибольшая цифра"+x11);
        }
         else if (x22>x11 & x22>x33){
             System.out.println("В числе"+n+"наибольшая цифра"+x22);
         }
         else if ((x22>x11 & x22==x33)||(x22>x33 & x22==x11)){
             System.out.println("В числе"+n+"наибольшая цифра"+x22);
         }
         else if (x33>x11 & x33>x22){
             System.out.println("В числе"+n+"наибольшая цифра"+x33);
         }
         else if ((x33>x11 & x33==x22)||(x33>x22 & x33==x11)){
             System.out.println("В числе"+n+"наибольшая цифра"+x33);
         }
         else {
            System.out.println("В числе"+n+"все цифры равны");
        }
    }
}
