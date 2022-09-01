package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer elem : sourceList) {
            if (elem % 2 == 0) {
                set.add(elem);
                int temp = elem;
                while (temp % 2 == 0) {
                    temp /= 2;
                    set.add(temp);
                }
            } else {
                set.add(elem);
                set.add(elem * 2);
            }
        }
        return set;
    }
}
