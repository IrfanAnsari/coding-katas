package com.aal.basic.katas.swapvalue;

/**
 * Swapping values of two variables without using a third variable.
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 13:56
 */
public class ValueSwaper {
    public NameValue swap(NameValue nameValue1, NameValue nameValue2) {

        int a = nameValue1.getValue();
        int b = nameValue2.getValue();

        if(a >= Integer.MAX_VALUE/2 && b >= Integer.MAX_VALUE/2){
            throw new IllegalArgumentException("Can't use this technic to swap the number");
        }
        a = a + b;

        b = a - b;
        a = a - b;

        return new NameValue("var1", a);
    }
}
