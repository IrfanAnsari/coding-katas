package com.aal.basic.katas.primenumber;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberChecker {
    public boolean isPrime(int number) {


        if (number <= 2) {
            return true;
        }

        int i = 2;

        while (i < number) {
            if (number % i == 0)
                return false;
            i++;
        }

        return true;
    }

    /**
     * This is just to translate to use the for loop, no change in logic.
     * @param number
     * @return
     */

    public boolean isPrimeUsingForLoop(int number) {


        if (number <= 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    /**
     * We Don't need to iterate all the way to the number being checked for prime.
     * We can only check half of the number as all the even numbers are divisible by 2.
     * If we can find a divisor of n between 1 and n/2, then it can't be prime number.
     *
     * @param number
     * @return
     */
    public boolean isPrimeMoreEffective(int number) {


        if (number <= 2) {
            return true;

        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /** if n is a not a prime number then it can be represented as x * y = n.
     *
     * if x can't be greater than Sqrt(n), which would mean y is < Sqrt(n).
     *
     * @param number
     * @return
     */

    public boolean isPrimeUsingSqrt(int number) {

        if (number <= 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }


    public boolean isPrimeWithImprovedLoop(int number){

        if (number <= 2) {
            return true;
        }

        if(number % 2 == 0) {
            return false;
        }
        // Avoiding looping through all the even number
        for (int i = 3; i  <= Math.sqrt(number); i+=2) {
            if (number % i == 0){
                return false;
            }
        }

        return true;

    }

    public static class PrimeNumberCheckerTest {
        PrimeNumberChecker primeChecker;
        @Before
        public void setUp(){
           primeChecker = new PrimeNumberChecker();

        }
        @Test
        public void shouldVerifyOneAsAPrimeNumber(){
        //Given

        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(1);
        //THen
            assertThat(prime, is(true));
        }

        @Test
        public void shouldVerifyTwoAsAPrimeNumber(){
        //Given

        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(2);
        //THen
            assertThat(prime, is(true));
        }

        @Test
        public void shouldVerifyTheeAsAPrimeNumber(){
        //Given
             PrimeNumberChecker primeChecker = new PrimeNumberChecker();
        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(3);
        //THen
            assertThat(prime, is(true));
        }

        @Test
        public void shouldVerifyFourAsNonPrimeNumber(){
        //Given



            boolean prime = primeChecker.isPrimeWithImprovedLoop(4);
        //THen
            assertThat(prime, is(false));
        }
         @Test
        public void shouldVerifyFiveAsPrimeNumber(){
        //Given



            boolean prime = primeChecker.isPrimeWithImprovedLoop(5);
        //THen
            assertThat(prime, is(true));
        }

        @Test
        public void shouldVerifySixAsNonPrimeNumber(){
        //Given

        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(6);
        //THen
            assertThat(prime, is(false));
        }

        @Test
        public void shouldVerifyTwnetyNineAsPrimeNumber(){
        //Given

        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(29);
        //THen
            assertThat(prime, is(true));
        }

        @Test
        public void shouldVerifyThirtyAsNonPrimeNumber(){
        //Given

        //When


            boolean prime = primeChecker.isPrimeWithImprovedLoop(30);
        //THen
            assertThat(prime, is(false));
        }




    }
}
