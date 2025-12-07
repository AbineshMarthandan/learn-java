package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class forEachExample {
    public static void main(String args[]) {
        List<Integer> al = Arrays.asList(4, 5, 6, 7, 34, 54, 6, 7);
        al.stream().forEach(item -> System.out.println(item));
        List<Integer> data = al.stream().map(item -> item * 2).toList();
        List<Integer> sortedArray = data.stream().sorted((a, b) -> b - a).toList();
        System.out.println(sortedArray);
        System.out.println(data.size());
        System.out.println(data);
        Function<Integer, Integer> fn = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
        List<Integer> result = al
                .stream()
                .sorted()
                .filter(item -> item % 2 == 0)
                .map(fn)
                .toList();
        System.out.println(result);
        Integer reduceResult = al
                .stream()
                .sorted()
                .filter(item -> item % 2 == 0)
                .map(fn)
                .reduce(0, (acc, item) -> acc + item);
        System.out.println(reduceResult);

    }
}
