package streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;


public class ConcatWords {
    public static void main(String[] args) throws IOException {
  Map<Integer, List<String>> result= Files.lines(Paths.get("D:\\IDEAProjects\\dapastushenkoITMONew\\src\\multithreading2\\wp"))
                        .parallel()
                        .map(line -> line.toLowerCase().replaceAll("\\pP"," "))
                        .flatMap(line -> Arrays.stream(line.split(" ")))
                        .map(String::trim)
                        .filter(word -> !"".equals(word))
                        .collect(groupingBy(String::length));
                        result.entrySet().forEach(System.out::println);
    }
}
