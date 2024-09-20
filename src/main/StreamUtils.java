package main;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUtils {

    //Task 1

    public String filter(List<String> names) {
        return names.stream()
                .map(name -> names.indexOf(name) + 1 + ". " + name)
                .toList().toString();
    }

    // Task 2

    public String strSort(List<String> strings)  {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList().toString();
    }

    // Task 3

    public int[] arrSort(int[] array) {
        return IntStream.of(array).sorted().toArray();
    }

    // Task 4

    public Stream<Long> generate(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    // Task 5

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorF = first.iterator();
        Iterator<T> iteratorS = second.iterator();

        return Stream.iterate(0, pair -> iteratorF.hasNext() && iteratorS.hasNext(), pair -> pair)
                .flatMap(pair -> Stream.of(iteratorF.next(), iteratorS.next()));
    }

}
