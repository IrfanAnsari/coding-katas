package com.aal.basic.katas;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


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
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(0);
        //THen
        assertThat(firstFibonacciNumber, is(0));
    }

    @Test
    public void shouldReturnSecondFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(1);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturnThirdFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(2);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturn4thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(3);
        //THen
        assertThat(firstFibonacciNumber, is(2));
    }

    @Test
    public void shouldReturn5thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(5);
        //THen
        assertThat(firstFibonacciNumber, is(5));
    }

    @Test
    public void shouldReturn6thFibonacciNumber() {
        //Given

        //When
        int firstFibonacciNumber = numberGenerator.fibonacciUsingLoop(6);
        //THen
        assertThat(firstFibonacciNumber, is(8));
    }


    @Test
    public void shouldPrintFibonacciNumbersUptoGivenPosition() {
        //Given

        //When
        for (int i = 0; i <= 20; i++) {
            System.out.print(numberGenerator.fibonacciUsingLoop(i) + ", ");
        }
        //THen

    }
}
