package patterns.sensor;

public class Main {
    public static void main(String[] args){
        MainListener ml=new MainListener();
        ml.subscribe(new GreenAlarm());
        ml.subscribe(new YellowAlarm());
        ml.subscribe(new RedAlarm());

        for (int i=1; i<650;i++){
ml.notefyListners(i);
        }

    }
}
