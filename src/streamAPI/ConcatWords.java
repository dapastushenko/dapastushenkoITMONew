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
//Files.lines(Paths.get("G:\\IDEAProjects\\dapastushenkoITMONew\\src\\multithreading2\\wp.txt"))
//        Map<Integer,List> mapa= Files.lines("G:\\IDEAProjects\\dapastushenkoITMONew\\src\\multithreading2\\wp")
//                .parallel();


//        Path path = "D:\\wp.txt";
        //List<String> lines = Files.readAllLines(Paths.get(FILE_NAME), StandardCharsets.UTF_8);
/*        Map<String,List> res = Files.readAllLines(Paths.get("G:\\IDEAProjects\\dapastushenkoITMONew\\src\\multithreading2\\wp.txt"))
                               .map(line->line.toLowerCase().replaceAll("pP"," "))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(String::trim)
                .filter(word -> !"".equals(word))
                .collect(groupingBy(Function.identity(),counting()))
                .entrySet().parallelStream()
                .sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue()))
                .limit(10)
                .collect(toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.printf(String.valueOf(res));
*/
        Map<String, List> result = Files.lines(Paths.get("D:\\wp.txt"))
                        .parallel()
                        .map(line -> line.toLowerCase().replaceAll("\\pP"," "))
                        .flatMap(line -> Arrays.stream(line.split(" ")))
                        .map(String::trim)
                        .filter(word -> !"".equals(word))
                        .collect(groupingBy(identity(),counting()))
                        .entrySet().parallelStream()
                        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                        .limit(10)
                .collect(toMap(()))
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(result);

    }
}
