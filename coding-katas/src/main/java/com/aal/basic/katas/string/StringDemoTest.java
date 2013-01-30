package com.aal.basic.katas.string;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 14:30
 */
public class StringDemoTest {


    private StringDemo stringDemo;

    @Before
    public void setUp(){

        stringDemo = new StringDemo();
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNullString(){
    //Given

    //When
      String revString  = stringDemo.reverseRecursively(null);
    //THen

    }


    @Test
    public void shouldReturnSameStringWhenItHasOnlyCharacter(){
    //Given

    //When
           String reverseRecursivelydString = stringDemo.reverseRecursively("A");
    //THen
         assertThat(reverseRecursivelydString, is("A"));
    }

    @Test
    public void shouldreverseRecursivelyTwoLetterString(){
    //Given
       StringDemo stringDemo = new StringDemo();
    //When
       String reverseRecursivelydString = stringDemo.reverseRecursively("AB");
    //THen
       assertThat(reverseRecursivelydString, is("BA"));
    }

    @Test
    public void shouldreverseRecursivelyThreeLetterString(){
    //Given

    //When
       String reverseRecursivelydString = stringDemo.reverseRecursively("ABC");
    //THen
       assertThat(reverseRecursivelydString, is("CBA"));
    }


    @Test
    public void shouldreverseRecursivelyTenLetterString(){
    //Given

    //When
       String reverseRecursivelydString = stringDemo.reverseRecursively("ABCDEFGHIJK");
       System.out.println(reverseRecursivelydString);
    //THen
       assertThat(reverseRecursivelydString, is("KJIHGFEDCBA"));
    }



}
