package com.company;

import java.util.function.Predicate;

public class Prädikat implements MyFunction, Predicate {
    @Override
    public int apply(int i) {
        return 0;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
