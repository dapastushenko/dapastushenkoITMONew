package multithreading2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordMap;

    private void start() throws InterruptedException, IOException {

        int cpuCount = Runtime.getRuntime().availableProcessors();

        List<String> words = textpars();

        int part = words.size() / cpuCount;
        List<Counter> threads = new ArrayList<>(cpuCount);

        for (int i = 0, n = 0; i < cpuCount; i++) {
            threads.add(new Counter(words.subList(n, n + part)));
            n = n + part;
        }

        for (Counter thread : threads) {
            thread.start();
        }

        for (Counter thread : threads)
            thread.join();

        // count top 100
    }

    private List<String> textpars() throws IOException {
        File text = new File("D:\\wp.txt");
        List<String> lines = Files.readAllLines(text.toPath());
        List<String> wrds = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .trim()
                    .split("\\s");
            for (String n : split) {
                if (n.length() > 0) {
                    wrds.add(n.trim());
                }
            }
        }
        return wrds;
    }

    private class Counter extends Thread {
        private final List<String> words;
        private final Map<String, Integer> map = new HashMap<>();


        private Counter(List<String> words) {
            this.words = words;
        }

        @Override
        public void run(){
            for (String word : words) {
                Integer cnt = map.get(word);

                if (cnt == null)
                    map.put(word, 1);
                else
                    map.replace(word, cnt + 1);
            }
            // map to wordMap
            synchronized(WordCounter.this) {
                if (wordMap == null)
                    wordMap = new HashMap<>();

                wordMap.putAll(map);
//                wordMap.merge(map);
                // использовать merge

            }
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
     new WordCounter().start();
    }
}
