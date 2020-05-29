package com.company;

import java.util.function.IntPredicate;

public interface MyFunction {
    int apply(int i);

    //Lamda = implemeniterun eines funktionalen interfaces, d.h wir benötigen ein Objekt MyFunction
    default MyFunction conditionateInput (IntPredicate preadikat){
        return funktion-> preadikat.test(funktion) ? apply (funktion) : 0;
    }

    default MyFunction conditionateOutput(IntPredicate preadikat){
        return funktion-> preadikat.test(apply(funktion)) ? apply(funktion) : 0;
    }
}
