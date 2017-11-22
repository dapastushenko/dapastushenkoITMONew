package patterns.sensor;

public class YellowAlarm implements Listener{
    private boolean needShow=false;
    @Override
    public void checktemp(int temperature) {
        if (needShow==false&&temperature==300) {
            needShow=true;
            System.out.printf("YELLOW ALARM!%n");
        }
    }
}
