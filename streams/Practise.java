package streams;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,2,3,9);
        Predicate<Integer> pred = n -> n %2 == 1;
        Function<Integer, Integer> funMap = n -> (int)n * 1;
        int num = nums.parallelStream().map(funMap).filter(pred).sorted().reduce(0, (c,e) -> c+e);

        System.out.println(num);

    }
}
