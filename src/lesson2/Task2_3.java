package lesson2;

public class Task2_3 {
    public static void main(String[] args){
//ax2+bx+c=0
     float a = 2;
     float b = 5;
     float c = 3;
     double discr = b*b-4*a*c;
     float x1;
        float x2;
     if (discr<0){
         System.out.println("Корней нет");
        }
        else if(discr==0){
         x1=-b/(2*a);
         System.out.println(x1);
        }
        else if (discr>0){
            x1 = (-b+(float)Math.sqrt(discr))/(2*a);
            x2 = (-b-(float)Math.sqrt(discr))/(2*a);
            System.out.println("x1="+x1+"x2="+x2);
        }
    }
}
