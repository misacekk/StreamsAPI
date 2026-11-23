import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Petr", "Karel");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        List<Integer> cisla = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        cisla.stream().filter(c -> c % 2 == 0).forEach(System.out::println);

        List<Integer> num = IntStream.rangeClosed(10, 20).boxed().toList();
        num.stream().filter(n -> n % 3 == 0).forEach(System.out::println);

        names.stream()
                .map(String::length)
                .forEach(System.out::println);

        List<String> longUpperNames = names.stream()
                .filter(name -> name.length() >= 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(longUpperNames);

        List<String> aNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        List<String> firstLetters = names.stream()
                .map(name -> name.substring(0, 1))
                .toList();

        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined);

        long count = names.stream()
                .filter(name -> name.length() > 3)
                .count();

        long aCount = names.stream().filter(name -> name.startsWith("A")).count();
        System.out.println(aCount);
        boolean nameE = names.stream().anyMatch(name -> name.contains("e"));
        System.out.println(nameE);

        Optional<String> first = names.stream().findFirst().filter(name -> name.length() > 3);
        System.out.println(first.get());

    }
}