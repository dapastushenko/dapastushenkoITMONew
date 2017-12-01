package multithreading2;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordCounter {
    private Map<String,Integer> wordMap;

    private void start() throws InterruptedException, IOException {
        int cpucount = Runtime.getRuntime().availableProcessors();

        List<String> words = new ArrayList<>(textpars());

        int part = words.size()/cpucount;
        List<Counter> threads=new ArrayList<>(cpucount);

        for (int i=0,n=0; i<cpucount;i++){
            threads.add(new Counter(words.subList(n,n+part)));
            n = n + part;}

        for (Counter thread: threads)
            thread.join();

    }
    private ArrayList textpars() throws IOException {
        File text = new File("D:\\wp\\wp.txt");
        List<String> lines = Files.readAllLines(text.toPath());
        List<String> wrds = new ArrayList<>();
        for (String line:lines){
            String[] split = line.toLowerCase()
                    .replaceAll("\\p{Punct}"," ")
                    .trim()
                    .split("\\s");
            for(String n:split){
                if(n.length()>0){
                    wrds.add(n.trim());
                }
            }
        }
        return (ArrayList) wrds;
    }
    private class Counter extends Thread{
        private List<String> words = null;
        private final Map<String,Integer> map=new HashMap<>();


        private Counter(List<String> words) {
            for (int i=0; i<words.size();i++){

                if (map.isEmpty())
                    map.put(words.get(i),1);
                if (map.get(words.get(i))==null)
                    map.put(words.get(i),1);
                map.replace(words.get(i),(map.get(words.get(i)))+1);
            this.words=words;
        }

//        @Override
//        public void run() {
//            super.run();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        new wordCounter().start();
    }
}
