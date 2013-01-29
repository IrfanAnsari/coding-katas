package com.aal.basic.katas;

public class FibonacciNumberGenerator {


    /**
     * Using recursion
     * @param position
     * @return
     */
    public int atPosition(int position) {

        if(position < 2)
           return position;

        return atPosition(position - 2) + atPosition(position - 1);
    }


    /**
     * Fibonacci series using loop
     * @param position
     * @return
     */
    public int fibonacciUsingLoop(int position) {
       if(position < 2){
           return position;
       }

        int fib1 = 1, fib2=1, fib =1;

        for(int i = 3; i <= position ; i++){
              fib = fib1 + fib2;
              fib1 = fib2;
              fib2 = fib;
        }
        return fib;
    }

}
