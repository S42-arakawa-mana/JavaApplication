package lesson11;

import java.util.stream.IntStream;

public class IntStreamSample {
    public static void main(String[] args) {
        // 1 から 9 までの範囲
        IntStream stream = IntStream.range(1, 10);
        stream.forEach(System.out::println);
    }
}