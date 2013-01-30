package com.aal.basic.katas.primenumber;

import com.aal.basic.katas.primenumber.PrimeNumberChecker;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberCheckerTest {
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
