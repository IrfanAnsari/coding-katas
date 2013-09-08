package com.aal.basic.katas.changecalc;

import java.util.HashMap;
import java.util.Map;

/**
 * User: irfanansari
 * Date: 08/09/2013
 * Time: 01:14
 */
public class ChangeCalculator {

    private int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};

    public Map<Integer, Integer> getChange(int changeRequired) {

        if(changeRequired < 0){
            throw new IllegalArgumentException("We don't support negative coins :" + changeRequired);
        }

        Map<Integer, Integer> change = new HashMap<Integer, Integer>();

        for (int coin : coins) {

            int coinCount = changeRequired / coin;

            if (coinCount != 0) {
                change.put(coin, coinCount);
                changeRequired = changeRequired - coin * coinCount;

            }

        }


        return change;
    }
}
