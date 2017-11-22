public class Task2_20 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 99999; i++) {
            String s = String.valueOf(i);

            if ((s.indexOf('4')!= -1)||(s.indexOf("13")!=-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
