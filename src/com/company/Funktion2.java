package com.company;

public class Funktion2{
    public static int f(int n){
        return n == 0 ? 1 : n * f(n - 1);
    }
}
