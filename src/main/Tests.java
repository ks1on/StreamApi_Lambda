package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tests {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Anna", "Tykhon", "Ivan", "Larisa"));
        int[] ints = new int[] {7, 5, 6, 3, 4, 1, 2};

        StreamUtils stream = new StreamUtils();


        System.out.println(stream.filter(names));// Task 1
        System.out.println(stream.strSort(names));// Task 2
        System.out.println(Arrays.toString(stream.arrSort(ints)));// Task 3

        // Task 4

        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48); // 2^48
        long seed = 0;

        stream.generate(seed, a, c, m).limit(10).forEach(System.out::println);

        // Task 5

        Stream<Integer> first = Stream.of(1, 2, 3, 8);
        Stream<Integer> second = Stream.of(4, 5, 7);

        List<Integer> list = StreamUtils.zip(first, second).toList();
        System.out.println(list);
    }
}
