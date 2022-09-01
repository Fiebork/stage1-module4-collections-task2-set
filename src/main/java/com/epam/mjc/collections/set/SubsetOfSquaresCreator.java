package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set <Integer> set = new TreeSet<>();
        double low = Math.sqrt(lowerBound);
        double up = Math.sqrt(upperBound);
        for (Integer elem : sourceList) {
            if (Math.abs(elem) >= low && Math.abs(elem) <= up) {
                set.add((int)Math.pow(elem, 2));
            }
        }
        return set;
    }
}
