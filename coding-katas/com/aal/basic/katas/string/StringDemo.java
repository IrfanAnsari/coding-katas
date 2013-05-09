package com.aal.basic.katas.string;

/**
 * User: irfanansari
 * Date: 30/01/2013
 * Time: 14:34
 */
public class StringDemo {
    public String reverse(String toBeReversed) {

        if(toBeReversed == null){
           throw new IllegalArgumentException("Doesn't apply on null string");
        }

        StringBuilder builder = new StringBuilder(toBeReversed);
        return builder.reverse().toString();
    }




    public String reverseManually(String toBeReversed){

         if(toBeReversed == null){
           throw new IllegalArgumentException("Doesn't apply on null string");
         }

         StringBuffer buffer = new StringBuffer();

         for(int i = toBeReversed.length() - 1; i >=0 ; i-- ){
             buffer.append(toBeReversed.charAt(i));
         }
        return buffer.toString();
    }


    public String reverseRecursively(String toBeReversed){
        if(toBeReversed == null){
           throw new IllegalArgumentException("Doesn't apply on null string");
         }

        if(toBeReversed.length() < 2){
            return  toBeReversed;
        }

       return reverseRecursively(toBeReversed.substring(1)) + toBeReversed.charAt(0);
    }
}
