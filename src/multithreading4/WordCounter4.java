package multithreading4;

import multithreading3.WordCounter2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class WordCounter4 {
    private void start() throws InterruptedException, IOException, ExecutionException {
        Map<String, Integer> wordMap = new HashMap<>();

        int cpuCount = Runtime.getRuntime().availableProcessors();

        List<String> words = textpars();

        int part = words.size() / cpuCount;
        List<Counter> threads = new ArrayList<>(cpuCount);


        ExecutorService pool = Executors.newFixedThreadPool(cpuCount);

        List<Future<Map<String, Integer>>> res = new ArrayList<>();

        for (int i = 0, n = 0; i < cpuCount; i++) {
            Future<Map<String, Integer>> fut = pool.submit(new Counter(words.subList(n, n + part)));

            res.add(fut);

            n = n + part;
        }

        for (Future<Map<String, Integer>> future : res) {
            Map<String, Integer> map = future.get();


        }

        // count top 100
    }

    private static class Counter implements Callable<Map<String, Integer>> {
        private final List<String> words;

        private Counter(List<String> words) {
            this.words = words;
        }

        @Override
        public Map<String, Integer> call() throws Exception{
            Map<String, Integer> map = new HashMap<>();

            for (String word : words) {
                Integer cnt = map.get(word);

                if (cnt == null)
                    map.put(word, 1);
                else
                    map.replace(word, cnt + 1);
            }

            return map;
        }
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



    public static void main(String[] args) throws InterruptedException, IOException, ExecutionException {
        try {
            new WordCounter4().start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
