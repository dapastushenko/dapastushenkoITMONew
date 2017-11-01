package Lesson6.Shapes;

import java.net.SocketPermission;
import java.util.Scanner;

public class Circle implements Shape {

    @Override
    public void getS() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите центр круга");
        int firstpoint =in.nextInt();
        System.out.println("Введите точку на линии круга");
        int secondpoint =in.nextInt();
        float S = (float) (Math.PI * ((secondpoint - firstpoint) * (secondpoint - firstpoint)));
        System.out.println("Площадь равна=" + S);
    }

    @Override
    public void getP() {

    }
}
