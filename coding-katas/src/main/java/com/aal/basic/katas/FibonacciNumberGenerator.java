package com.aal.basic.katas;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumberGenerator {

    private Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

    /**
     * Using recursion
     *
     * @param position
     * @return
     */
    public int atPosition(int position) {

        if (position < 2)
            return position;

        return atPosition(position - 2) + atPosition(position - 1);
    }


    /**
     * Fibonacci series using loop
     *
     * @param position
     * @return
     */
    public int fibonacciUsingLoop(int position) {
        if (position < 2) {
            return position;
        }

        int fib1 = 1, fib2 = 1, fib = 1;

        for (int i = 3; i <= position; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }


    public int improvedFibo(int position) {

        Integer fibNumber = cache.get(position);

        if (fibNumber != null) {
            return fibNumber;
        }

        if (position < 2) {
            cache.put(position, position);
            return position;
        }

        int fib = improvedFibo(position - 2) + improvedFibo(position - 1);
        cache.put(position, fib);

        return fib;


    }

}
