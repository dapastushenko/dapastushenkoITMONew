package patterns.sensor;

public class GreenAlarm implements Listener{
    private boolean needShow=false;
    @Override
    public void checktemp(int temperature) {
        if (needShow==false&&temperature==100) {
            needShow=true;
            System.out.printf("GREEN ALARM!%n");
        }
    }
}
