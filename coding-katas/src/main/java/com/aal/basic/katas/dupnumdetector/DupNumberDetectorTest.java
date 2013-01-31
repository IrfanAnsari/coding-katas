package com.aal.basic.katas.dupnumdetector;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: irfanansari
 * Date: 31/01/2013
 * Time: 14:02
 */
public class DupNumberDetectorTest {

    private DupNumberDetector dupNumberDetector;

    @Before
    public void setUp() {
        dupNumberDetector = new DupNumberDetector();
    }

    @Test
    public void shouldReturn2AsDuplicateNumberInAnArrayOfThreeNumberWhere2isDuplicate() {
        //Given

        int[] numArray = {1, 2, 2};
        //When
        int dupNumber = dupNumberDetector.findDup(numArray);
        //THen
        assertThat(dupNumber, is(2));
    }

    @Test
    public void shouldReturn5In6NumsArraysWhere5IsDuplicateNumber() {
        //Given
        int[] numArray = {1, 2, 3, 3, 4, 5};
        //When
        int dupNumber = dupNumberDetector.findDup(numArray);
        //THen
        assertThat(dupNumber, is(3));

    }

}
