package com.company;


import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main implements MyFunction {

    private static Scanner input;
    private static boolean praedikat = false;
    private static int zahl;


    /**
     * Methode zum Ausfuehren und Ausgeben der Funktionen
     *
     * @param i        -   Start der Funktion
     * @param j        -   Ende der Funktion
     * @param funktion -   Funktion die ausgefuehrt werden soll    -   Muss zwischen 1 und 4 sein
     * @return int     ergebnis
     */
    public static int applyAndPrint(int i, int j, int funktion) {
        int ergebnis = 0;

        /* Tauschen der Variablen falls j kleiner als i ist */
        if (j < i) {
            int temp = i;
            i = j;
            j = temp;
        }


        /* Auswahl der Funktion */
        /* Realisierung mit anonymen Klassen */
        if (funktion == 1) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return i * i;
                }
            };
            ergebnis = mf.apply(i);

        } else if (funktion == 2) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return f(i);
                }
            };
            ergebnis = mf.apply(i);
        } else if (funktion == 3) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return xHochXPlusEins(i);
                }
            };
            ergebnis = mf.apply(i);
        } else if (funktion == 4) {
            MyFunction mf = new MyFunction() {
                @Override
                public int apply(int i) {
                    return fibonacci(i);
                }
            };
            ergebnis = mf.apply(i);
        }
        /* Realisierung mit Lambda */
        else if(funktion == 11) {
            MyFunction mf = i1 -> i1 * i1;
            ergebnis = mf.apply(i);

        } else if (funktion == 21) {
            MyFunction mf = Main::f;
            ergebnis = mf.apply(i);
        } else if (funktion == 31) {
            MyFunction mf = Main::xHochXPlusEins;
            ergebnis = mf.apply(i);
        } else if (funktion == 41) {
            MyFunction mf = Main::fibonacci;
            ergebnis = mf.apply(i);

            /* Realisierung mit Nested Class */
        } else if (funktion == 32){
            ergebnis = Funktion2Nested.f(i);
            /* Realisierung mit Top Level Class */
        } else if (funktion == 33){
            ergebnis = Funktion2.f(i);
        }

        /* Schleife zum Ausfuehren der Funktion von i bis j */
        if (i < j) {
            ergebnis += applyAndPrint(i + 1, j, funktion);
        }
        return ergebnis;
    }

    @Override
    public int apply(int i) {
        if(praedikat = false) {
            int funktion = i;
            System.out.println("Geben Sie den Startwert ein: ");
            i = input.nextInt();
            input.nextLine();
            System.out.println("Geben Sie den Endwert ein: ");
            int j = input.nextInt();
            input.nextLine();
            return applyAndPrint(i, j, funktion);
        }else{
            return applyAndPrint(zahl, zahl, i);
        }
    }

    /**
     * Hilfsmethode zum Berechnen der Fakultaet
     * @param n =   Zahl deren Fakultaet berechnet werden soll
     * @return  int     Fakultaet
     */
    private static int f(int n) {
        return n == 0 ? 1 : n * f(n - 1);
    }

    /**
     * Hilfsmethode zum Berechnen der Formel x^(x+1)
     * @param x =   Zahl mit der die Formel berechnet wird
     * @return  int     Ergebnis der Formel
     */
    private static int xHochXPlusEins(int x) {
        int ergebnis;
        ergebnis = (int) Math.pow(x, x + 1);
        return ergebnis;
    }

    /**
     * Hilfsmethode zum Berechnen der Fibonacci Folge
     * @param i =   Zahl deren Fibonacci Folge berechnet werden soll
     * @return  int     Ergebnis der Folge
     */
    private static int fibonacci(int i) {
        if (i == 1 || i == 2) return 1;

        else return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main (String [] args){
        Main main = new Main();
        input = new Scanner(System.in);
        System.out.println("Geben Sie die Funktion ein:" + "\nAnonyme Klassen"+ "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
        System.out.println("\nLambda Ausdrücke"+ "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
        System.out.println("\nStatic Nested Class"+ "\n32: x!");
        System.out.println("\nTop Level Class"+ "\n33: x!");
        System.out.println("\n99: Prädikate benutzen");
        int i = input.nextInt();
        input.nextLine();
        if(i == 99){
            praedikat = true;
            System.out.println("\n1: even\n2: odd");
            int praedikat = input.nextInt();
            input.nextLine();
            if(praedikat == 1){
                System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                zahl = input.nextInt();
                input.nextLine();
                IntPredicate even = test -> {return zahl%2==0;};
                System.out.println("Geben Sie die Funktion ein:" + "\nAnonyme Klassen"+ "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
                System.out.println("\nLambda Ausdrücke"+ "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                System.out.println("\nStatic Nested Class"+ "\n32: x!");
                System.out.println("\nTop Level Class"+ "\n33: x!");
                int funktion = input.nextInt();
                input.nextLine();
                System.out.println(main.conditionateInput(even, funktion));

            } else if(praedikat == 2){
                System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                int zahl = input.nextInt();
                input.nextLine();
                IntPredicate odd = test -> {return zahl%2==1;};
                System.out.println("Geben Sie die Funktion ein:" + "\nAnonyme Klassen"+ "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
                System.out.println("\nLambda Ausdrücke"+ "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                System.out.println("\nStatic Nested Class"+ "\n32: x!");
                System.out.println("\nTop Level Class"+ "\n33: x!");
                int funktion = input.nextInt();
                input.nextLine();
                System.out.println(main.conditionateInput(odd, funktion));

            }
        } else {

            System.out.println(main.apply(i));
        }
        input.close();
    }

    public static class Funktion2Nested{
        public static int f(int n){
            return n == 0 ? 1 : n * f(n - 1);
        }
    }
}

