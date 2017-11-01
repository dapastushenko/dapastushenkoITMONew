public class Task2_19 {
    public static void main(String[] args) {
        int count = 1;
        int hours, minutes = 1;

        for (hours = 1; hours <= 23; hours++) {
            for (minutes = 1; minutes <= 51; minutes++) {
                if ((hours % 10 == minutes / 10) & (minutes % 10 == hours / 10)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

