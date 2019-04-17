package com.snarek.assignment.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Narek Sarkisyan : mail-to snarek@gmail.com
 */
public final class TestUtils {

    private TestUtils(){}

    public static List<Integer> asList(Integer... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }
}
