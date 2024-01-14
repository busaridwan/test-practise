package com.busaridwan.testpractice.dsa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 6, 3, 1, 9, 7, 2, 1};
        Map<Integer, Integer> counts = new HashMap<>(arr.length);
        for (int i : arr) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        counts.forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("Currency Format "+ currencyFormat(new BigDecimal(12345.65)));
    }

    static String currencyFormat(BigDecimal amount){
        DecimalFormat format = new DecimalFormat("$###,###.##");
        return format.format(amount);
    }
}
