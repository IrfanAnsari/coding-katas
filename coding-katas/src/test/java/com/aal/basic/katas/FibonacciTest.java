package com.aal.basic.katas;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FibonacciTest {

    @Test
    public void shouldReturnFirstFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(0);
        //THen
        assertThat(firstFibonacciNumber, is(0));
    }

    @Test
    public void shouldReturnSecondFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(1);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturnThirdFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(2);
        //THen
        assertThat(firstFibonacciNumber, is(1));
    }

    @Test
    public void shouldReturn4thFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(3);
        //THen
        assertThat(firstFibonacciNumber, is(2));
    }

    @Test
    public void shouldReturn5thFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(5);
        //THen
        assertThat(firstFibonacciNumber, is(5));
    }

    @Test
    public void shouldReturn6thFibonacciNumber() {
        //Given
        FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
        //When
        int firstFibonacciNumber = numberGenerator.atPosition(6);
        //THen
        assertThat(firstFibonacciNumber, is(8));
    }



    @Test
    public void shouldPrintFibonacciNumbersUptoGivenPosition(){
    //Given
         FibonacciNumberGenerator numberGenerator = new FibonacciNumberGenerator();
    //When
           for(int i =0 ; i <= 20; i++){
               System.out.print(numberGenerator.atPosition(i) + ", ");
           }
    //THen

    }
}
