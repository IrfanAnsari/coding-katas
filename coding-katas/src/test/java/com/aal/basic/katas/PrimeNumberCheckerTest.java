package com.aal.basic.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberCheckerTest {

    @Test
    public void shouldVerifyOneAsAPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(1);
    //THen
        assertThat(prime, is(true));
    }

    @Test
    public void shouldVerifyTwoAsAPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(2);
    //THen
        assertThat(prime, is(true));
    }

    @Test
    public void shouldVerifyTheeAsAPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(3);
    //THen
        assertThat(prime, is(true));
    }

    @Test
    public void shouldVerifyFourAsNonPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(4);
    //THen
        assertThat(prime, is(false));
    }
     @Test
    public void shouldVerifyFiveAsPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(5);
    //THen
        assertThat(prime, is(true));
    }

    @Test
    public void shouldVerifySixAsNonPrimeNumber(){
    //Given
         PrimeNumberChecker primeChecker = new PrimeNumberChecker();
    //When


        boolean prime = primeChecker.isPrimeUsingForLoop(6);
    //THen
        assertThat(prime, is(false));
    }




}
