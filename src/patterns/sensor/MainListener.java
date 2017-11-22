package patterns.sensor;

import java.util.ArrayList;
import java.util.List;

public class MainListener{
    private List<Listener> listeners = new ArrayList<>();

    public void subscribe (Listener listener){
        listeners.add(listener);
    }

    public void notefyListners(int temperature){
        for (Listener listener:listeners){
            listener.checktemp(temperature);
        }
    }

}
