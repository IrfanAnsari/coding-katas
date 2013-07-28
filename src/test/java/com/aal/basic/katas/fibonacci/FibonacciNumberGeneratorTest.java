package com.aal.basic.katas.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class FibonacciNumberGeneratorTest {


    FibonacciNumberGenerator numberGenerator;

    @Before
    public void setUp() {
        numberGenerator = new FibonacciNumberGenerator();
    }

    @Test
    public void shouldReturnFirstFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(0);
        //THen
        assertThat(firstFibonacciNumber, is(0));
    }

    @Test
    public void shouldReturnSecondFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(1);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturnThirdFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(2);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturn4thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(3);
        //THen
        assertThat(firstFibonacciNumber, is(2));
    }

    @Test
    public void shouldReturn5thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(5);
        //THen
        assertThat(firstFibonacciNumber, is(5));
    }

    @Test
    public void shouldReturn6thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.improvedFibo(6);
        //THen
        assertThat(firstFibonacciNumber, is(8));
    }


    @Test
    public void shouldPrintFibonacciNumbersUptoGivenPosition() {
        //Given

        //When
        for (int i = 0; i <= 20; i++) {
            System.out.print(numberGenerator.improvedFibo(i) + ", ");
        }
        //THen

    }
}
