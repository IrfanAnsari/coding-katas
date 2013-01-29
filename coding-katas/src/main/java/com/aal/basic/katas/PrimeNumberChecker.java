package com.aal.basic.katas;

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


}
