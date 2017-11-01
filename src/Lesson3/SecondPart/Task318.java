/*
Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с того,
 чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не должны
 повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из таблицы
 умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15 примеров
 не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
 */
package Lesson3.SecondPart;

import java.util.ArrayList;

import java.util.Random;

public class Task318 {
    public static void main(String[] args) {
        ArrayList<String> rndArrayList = new ArrayList<String>();
        StringBuilder strngbldr = new StringBuilder();
        Random rand = new Random();
        String xy, yx;

        for (int i = 0; i < 15; i++) {
            //int x=(int)(Math.random() * ((10 + 2) - 2));
            //int y=(int)(Math.random() * ((10 + 2) - 2));
            do {
                int x = rand.nextInt(8) + 2;
                int y = rand.nextInt(8) + 2;
                xy = x + "*" + y;
                yx = y + "*" + x;
            } while (rndArrayList.indexOf(xy) > -1 || rndArrayList.indexOf(yx) > -1);

            rndArrayList.add(xy);
        }

        for (int i = 0; i < 15; i++) {
            strngbldr.append(rndArrayList.get(i) + " ");
        }

        System.out.println(strngbldr.toString());
    }
}
