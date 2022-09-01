package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set <String> set = new HashSet<>();
        for (String elem : thirdSet) {
            if (!firstSet.contains(elem) && !secondSet.contains(elem)) {
                set.add(elem);
            }
        }

        for (String elem : firstSet) {
            if (!thirdSet.contains(elem) && secondSet.contains(elem)) {
                set.add(elem);
            }
        }

        return set;
    }
}
