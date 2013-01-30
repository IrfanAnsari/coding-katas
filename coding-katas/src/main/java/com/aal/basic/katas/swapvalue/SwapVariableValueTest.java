package com.aal.basic.katas.swapvalue;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 13:52
 */
public class SwapVariableValueTest {

    private ValueSwaper valueSwaper;

    @Before
    public void setUp(){
           valueSwaper = new ValueSwaper();
    }

    @Test
    public void shouldSwapTheValueOfVariables(){
    //Given

    //When
        NameValue nameValue1 = new NameValue("var1", 3);
        NameValue nameValue2 = new NameValue("var2", 5);
        NameValue swappedValue = valueSwaper.swappingWithBitOperator(nameValue1, nameValue2);
    //THen

        assertThat(swappedValue.getName(), is("var1"));
        assertThat(swappedValue.getValue(), is(5));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionForBigNumbers(){
    //Given
    //When
        NameValue nameValue1 = new NameValue("var1", Integer.MAX_VALUE/2);
        NameValue nameValue2 = new NameValue("var2", Integer.MAX_VALUE/2);
        NameValue swappedValue = valueSwaper.swappingWithBitOperator(nameValue1, nameValue2);
    //THen

    }
}
