package com.aal.basic.katas.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 13:30
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();


    @Test
    public void shouldReturn1For1() {
        //Given

        //When
        String fizz = fizzBuzz.getSequence(1);
        //THen
        assertThat(fizz, is("1"));
    }


    @Test
    public void shouldReturn2For2() {
        //Given

        //When
        String fizz = fizzBuzz.getSequence(2);
        //THen
        assertThat(fizz, is("2"));
    }


    @Test
    public void shouldReturnFizzFor3() {
        //Given

        //When
        String fizz = fizzBuzz.getSequence(3);
        //THen
        assertThat(fizz, is("fizz"));
    }

    @Test
    public void shouldReturnFizzFor5() {
        //Given

        //When
        String fizz = fizzBuzz.getSequence(5);
        //THen
        assertThat(fizz, is("buzz"));
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        //Given

        //When
        String fizz = fizzBuzz.getSequence(15);
        //THen
        assertThat(fizz, is("fizzbuzz"));
    }
}
