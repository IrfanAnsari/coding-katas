package com.aal.basic.katas.fizzbuzz;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 13:31
 */
public class FizzBuzz {

    public String getSequence(int number) {

        if(number < 1) {
            throw new IllegalArgumentException("Fizz buzz is not applicable on zero or negative number ");
        }

         if(number % 15 == 0) {
            return "fizzbuzz";
        }
        if(number % 3 == 0 ){
            return "fizz";
        }

        if(number % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(number);

    }
}
