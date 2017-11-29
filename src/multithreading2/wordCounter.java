package multithreading2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordCounter {
    private Map<String,Integer> wordMap;

    private void start(){
        int cpucount = Runtime.getRuntime().availableProcessors();

        List<String> words = new ArrayList<>(); // read from disk
        int part = words.size()/cpucount;
        List<Counter> threads=new ArrayList<>(cpucount);

        for (int i=0; i<cpucount;i++)
            threads.add(new Counter(words.subList(0,0)));


    }
    private class Counter extends Thread{
        private final List<String> words;
        private final Map<String,Integer> map=new HashMap<>();

        private Counter(List<String> words) {
            this.words=words;
        }

        @Override
        public void run() {
            super.run();
        }
    }
public static void main(String[] args){
        new wordCounter().start();
}
}
