package com.example.j8_new_features;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams
{
    public static void main(String args[])
    {
        System.out.println("Creating list:");
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            strings.add("Item " + i);
        }

        strings.stream().parallel().forEach(s -> System.out.println(s));

        // the work below will only be executed if the above line is finished

        // if you need to process the data sequentially, a parallel stream may not be suitable

    }

}
