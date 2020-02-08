package pl.sda.MR.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    private static final List<String> stringList = Arrays.asList("aaa", "bbb", "cccc", "dddd", "eeee");


    public static void streamExample() {

        List<String> result = stringList.stream().filter(word -> word.length()>3).collect(Collectors.toList());
        System.out.println(result);
    }
}
