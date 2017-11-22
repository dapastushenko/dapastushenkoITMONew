package lesson4.intList;

public class IntStream {
    public static void main(String[] args) {
        IntList a = new IntList();
        a.add(2);

        a.add(3);
     //   System.out.println(a.nextitem.value);
        a.add(8);
//     System.out.println(a.nextitem.value);
        System.out.println(a.getItem(1).value);
    }

}
