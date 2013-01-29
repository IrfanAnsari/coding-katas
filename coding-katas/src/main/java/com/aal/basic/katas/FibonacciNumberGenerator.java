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



}
