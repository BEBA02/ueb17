package com.company;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public interface MyFunction {
    int apply(int i);

    default int conditionateInput (IntPredicate praedikat, int i){
        return praedikat.test(i) ? apply(i) : 0;
    }
}
