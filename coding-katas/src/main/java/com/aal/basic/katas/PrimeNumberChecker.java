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



}
