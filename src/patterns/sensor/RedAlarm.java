package patterns.sensor;

public class RedAlarm implements Listener{
    private boolean needShow=false;
    @Override
    public void checktemp(int temperature) {
        if (needShow==false&&temperature==600) {
            needShow=true;
            System.out.printf("RED ALARM!%n");
        }
    }
}
