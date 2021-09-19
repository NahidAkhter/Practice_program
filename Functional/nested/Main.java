package Functional.nested;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>>  nestedList = asList(
                asList(10,20,30),
                asList(12, 33, 44),
                asList(89, 56, 76)
        );

        Set<Integer> set1 = new HashSet<>(
                asList(10,20,30));

        int max = set1.stream().mapToInt( v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        System.out.println("Max" + max);

        nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
