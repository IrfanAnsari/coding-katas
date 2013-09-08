package com.aal.basic.katas.changecalc;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 17:25
 */
public class ChangeCalculatorTest {

     private ChangeCalculator changeCalculator = new ChangeCalculator();

    @Test
    public void shouldReturnACoinForExactMatchingAmount() {
        //Given


        Map<Integer,Integer> change = changeCalculator.getChange(1);
        assertThat(change.get(1), is(1));

        Map<Integer,Integer> changeFor2P = changeCalculator.getChange(2);
        assertThat(changeFor2P.get(2), is(1));

        Map<Integer,Integer> changeFor5P = changeCalculator.getChange(5);
        assertThat(changeFor5P.get(5), is(1));

        Map<Integer,Integer> changeFor10P = changeCalculator.getChange(10);
        assertThat(changeFor10P.get(10), is(1));

        Map<Integer,Integer> changeFor20P = changeCalculator.getChange(20);
        assertThat(changeFor20P.get(20), is(1));

        Map<Integer,Integer> changeFor50P = changeCalculator.getChange(50);
        assertThat(changeFor50P.get(50), is(1));

        Map<Integer,Integer> changeFor100P = changeCalculator.getChange(100);
        assertThat(changeFor100P.get(100), is(1));

        Map<Integer,Integer> changeFor200P = changeCalculator.getChange(200);
        assertThat(changeFor200P.get(200), is(1));
    }


    @Test
    public void shouldReturnMinimumCoinsForUnder5P(){
    //Given

    //When
        Map<Integer,Integer> changeFor4P = changeCalculator.getChange(4);
    //THen
        assertThat(changeFor4P.get(2), is(2));
        assertThat(changeFor4P.size(), is(1));
    }

    @Test
    public void shouldReturnMinimumCoinsForUnder9P(){
    //Given

    //When
        Map<Integer,Integer> changeFor9P = changeCalculator.getChange(9);
    //THen
        assertThat(changeFor9P.get(5), is(1));
        assertThat(changeFor9P.get(2), is(2));
        assertThat(changeFor9P.size(), is(2));
    }

    @Test
    public void shouldReturnMinimumCoinsForUnder8P(){
    //Given

    //When
        Map<Integer,Integer> changeFor8P = changeCalculator.getChange(8);
    //THen
        assertThat(changeFor8P.get(5), is(1));
        assertThat(changeFor8P.get(2), is(1));
        assertThat(changeFor8P.get(1), is(1));
        assertThat(changeFor8P.size(), is(3));
    }

    @Test
    public void shouldReturnMinimumCoinsForUnder58P(){
    //Given

    //When
        Map<Integer,Integer> changeFor78P = changeCalculator.getChange(78);
    //THen
        assertThat(changeFor78P.get(50), is(1));
        assertThat(changeFor78P.get(20), is(1));
        assertThat(changeFor78P.get(5), is(1));
        assertThat(changeFor78P.get(2), is(1));
        assertThat(changeFor78P.get(1), is(1));
        assertThat(changeFor78P.size(), is(5));
    }


    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionForNegativeCoins(){
    //Given

    //When
         changeCalculator.getChange(-2);
    //THen

    }
}
