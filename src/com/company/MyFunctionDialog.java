package com.company;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class MyFunctionDialog {
    //Scannerdeklaration
    private static Scanner input;

    private int zahl;

    //Funktionen
    private static final int FUNKTION_1             = 1;
    private static final int FUNKTION_2             = 2;
    private static final int FUNKTION_3             = 3;
    private static final int FUNKTION_4             = 4;
    private static final int FUNKTION_1_ANONYM      = 10;
    private static final int FUNKTION_2_ANONYM      = 20;
    private static final int FUNKTION_3_ANONYM      = 30;
    private static final int FUNKTION_4_ANONYM      = 40;
    private static final int FUNKTION_1_LAMBDA      = 11;
    private static final int FUNKTION_2_LAMBDA      = 21;
    private static final int FUNKTION_3_LAMBDA      = 31;
    private static final int FUNKTION_4_LAMBDA      = 41;
    private static final int FUNKTION_2_NESTED      = 12;
    private static final int FUNKTION_2_TOP_LEVEL   = 22;
    private static final int PREADIKAT_INPUT        = 5;
    private static final int PREADIKAT_OUTPUT       = 6;
    private static final int LAMBDA_QUADRAT         = 7;
    private static final int LAMBDA_FAKULTAET       = 8;
    private static final int ENDE                   = 99;


    //Fehlermeldungen und Ausgaben
    private static final String MSG_PROGRAMM_AUSWAHL = "Bitte wählen Sie einen der oben aufgelisteten Möglichkeiten aus!";
    private static final String MSG_FEHLER = "Ein Fehler wurde abgefangen";
    private static final String MSG_NEGATIV = "Die Zahl muss größer als 0 sein!";
    private static final String MSG_UNGUELTIGER_TYP = "Ungültiger Typ";


    public MyFunctionDialog() {
        input = new Scanner(System.in);
    }

    private void start() {
        int funktion = -1;
        while (funktion != ENDE) {
            try {
                funktion = einlesenFunktion();
                ausfuehrenFunktion(funktion);

            } catch (java.util.InputMismatchException e) {
                System.out.println(MSG_UNGUELTIGER_TYP);
                input.next();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(MSG_FEHLER + e);
                e.printStackTrace(System.out);
            }
        }
    }

    private int einlesenFunktion() {
        int eingabe;
        String dialog = "Was möchten Sie als nächstes machen?\n\n" +
                FUNKTION_1 + ": Quadrat - Funktion benutzen" + "\n" +
                FUNKTION_2 + ": Fakultät - Funktion benutzen" + "\n" +
                FUNKTION_3 + ": x^(x+1) Funktion benutzen" + "\n" +
                FUNKTION_4 + ": Fibonacci - Funktion benutzen" + "\n" +
                PREADIKAT_INPUT + ": Ein PrädikatInput als Argument übergeben\n" +
                PREADIKAT_OUTPUT + ": Ein PrädikatOutput als Argument übergeben\n" +
                LAMBDA_QUADRAT + ": Lambda-Quadrat benutzen\n" +
                LAMBDA_FAKULTAET +": Lambda-Fakultät\n"+
                ENDE + ": Programm beenden" + "\n"
                + "==>";
        System.out.println(dialog);
        eingabe = input.nextInt();
        return eingabe;
    }

    private void ausfuehrenFunktion(int funktion) {
        int i;

        switch (funktion) {
            case FUNKTION_1:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_1_ANONYM + ": Anonym\n" +
                        FUNKTION_1_LAMBDA + ": Lambda\n");
                int verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_1_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));

                }else if(verfahren == FUNKTION_1_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    input.nextLine();
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;

            case FUNKTION_2:
                System.out.println("Wie soll die Fakultät-Funktion berechnet werden?\n" +
                        FUNKTION_2_ANONYM + ": Anonym\n" +
                        FUNKTION_2_LAMBDA + ": Lambda\n" +
                        FUNKTION_2_NESTED + ": Nested\n" +
                        FUNKTION_2_TOP_LEVEL + ": Top-Level\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_2_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));

                }else if(verfahren == FUNKTION_2_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));
                }else if(verfahren == FUNKTION_2_NESTED) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass.applyAndPrint(i,j,12);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,12));
                } else if(verfahren == FUNKTION_2_TOP_LEVEL){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass.applyAndPrint(i,j,22);
                    System.out.println(MyFunctionClass.applyAndPrint(i,j,22));
                } else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;

            case FUNKTION_3:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_3_ANONYM + ": Anonym\n" +
                        FUNKTION_3_LAMBDA + ": Lambda\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_3_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));

                }else if(verfahren == FUNKTION_3_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;
            case FUNKTION_4:
                System.out.println("Wie soll die Quadrat-Funktion berechnet werden?\n" +
                        FUNKTION_4_ANONYM + ": Anonym\n" +
                        FUNKTION_4_LAMBDA + ": Lambda\n");
                verfahren = input.nextInt();
                input.nextLine();
                if(verfahren == FUNKTION_4_ANONYM) {
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));

                }else if(verfahren == FUNKTION_4_LAMBDA){
                    System.out.println("Geben Sie den i ein:\n");
                    i = input.nextInt();
                    input.nextLine();
                    Validator.check(i <= 0, MSG_NEGATIV);
                    System.out.println("Geben Sie den j ein:\n");
                    int j = input.nextInt();
                    input.nextLine();
                    Validator.check(j <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    mfc.setJ(j);
                    mfc.setFunktion(verfahren);
                    System.out.println(mfc.apply(i));
                }else{
                    System.out.println("Es wurde noch kein Verfahren gewählt!\n");
                }
                break;
            case PREADIKAT_INPUT:
                System.out.println("\n1: even\n2: odd");
                int praedikat = input.nextInt();
                input.nextLine();
                if(praedikat == 1){
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    Validator.check(zahl <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    IntPredicate even = MyFunctionClass.even();
                    mfc.setJ(zahl);
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen"+
                            "\n10: x^2\n20: x!\n30:x^(x+1)\n40:fib(x)");
                    System.out.println("\nLambda Ausdrücke"+
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class"+
                            "\n12: x!");
                    System.out.println("\nTop Level Class"
                            + "\n22: x!");
                    funktion = input.nextInt();
                    input.nextLine();
                    mfc.setFunktion(funktion);
                    MyFunction function = mfc.conditionateInput(even);
                    System.out.println(function.apply(zahl));

                } else if(praedikat == 2) {
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    Validator.check(zahl <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    IntPredicate odd = MyFunctionClass.odd();
                    mfc.setJ(zahl);
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen"+
                            "\n10: x^2\n20: x!\n30:x^(x+1)\n40:fib(x)");
                    System.out.println("\nLambda Ausdrücke"+
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class"+
                            "\n12: x!");
                    System.out.println("\nTop Level Class"
                            + "\n22: x!");

                    funktion = input.nextInt();
                    mfc.setFunktion(funktion);
                    MyFunction function = mfc.conditionateInput(odd);
                    System.out.println(function.apply(zahl));
                }
                break; 
            case PREADIKAT_OUTPUT:
                System.out.println("\n1: even\n2: odd");
                praedikat = input.nextInt();
                input.nextLine();
                if(praedikat == 1){
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    Validator.check(zahl <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    IntPredicate even = MyFunctionClass.even();
                    mfc.setJ(zahl);
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen"+
                            "\n10: x^2\n20: x!\n30:x^(x+1)\n40:fib(x)");
                    System.out.println("\nLambda Ausdrücke"+
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class"+
                            "\n12: x!");
                    System.out.println("\nTop Level Class"
                            + "\n22: x!");
                    funktion = input.nextInt();
                    input.nextLine();
                    mfc.setFunktion(funktion);
                    MyFunction function = mfc.conditionateOutput(even);
                    System.out.println(function.apply(zahl));

                } else if(praedikat == 2) {
                    System.out.println("Bitte geben Sie die zu testende Zahl ein:");
                    int zahl = input.nextInt();
                    input.nextLine();
                    Validator.check(zahl <= 0, MSG_NEGATIV);
                    MyFunctionClass mfc = new MyFunctionClass();
                    IntPredicate odd = MyFunctionClass.odd();
                    mfc.setJ(zahl);
                    System.out.println("Geben Sie die Funktion ein:" +
                            "\nAnonyme Klassen" +
                            "\n1: x^2\n2: x!\n3:x^(x+1)\n4:fib(x)");
                    System.out.println("\nLambda Ausdrücke" +
                            "\n11: x^2\n21: x!\n31:x^(x+1)\n41:fib(x)");
                    System.out.println("\nStatic Nested Class" +
                            "\n12: x!");
                    System.out.println("\nTop Level Class" +
                            "\n22: x!");

                    funktion = input.nextInt();
                    mfc.setFunktion(funktion);
                    MyFunction function = mfc.conditionateOutput(odd);
                    System.out.println(function.apply(zahl));
                }
                break;
            case LAMBDA_QUADRAT:
                System.out.println("Geben Sie die zu testende Zahl ein");
                zahl = input.nextInt();
                input.nextLine();
                Validator.check(zahl <= 0, MSG_NEGATIV);
                IntPredicate even = MyFunctionClass.even();
                if (even.test(zahl)){
                    System.out.println("Bitte Wählen sie ein verfahren\n"+
                            FUNKTION_1_ANONYM + ": Anonym\n"+
                            FUNKTION_1_LAMBDA + ": Lambda\n"+
                            "==>");
                    verfahren = input.nextInt();
                    input.nextLine();
                    if(verfahren==FUNKTION_1_ANONYM){
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 10);
                        System.out.println(mf.apply(zahl));
                    }
                    if (verfahren==FUNKTION_1_LAMBDA) {
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 11);
                        System.out.println(mf.apply(zahl));
                    }
                } else {
                    System.out.println("0");
                 }
                break;
            case LAMBDA_FAKULTAET:
                System.out.println("Geben Sie die zu testende Zahl ein");
                zahl = input.nextInt();
                input.nextLine();
                Validator.check(zahl <= 0, MSG_NEGATIV);
                IntPredicate odd = MyFunctionClass.odd();
                if (odd.test(MyFunctionClass.applyAndPrint(zahl,zahl,20))){
                    System.out.println("Wie soll die Fakultät-Funktion berechnet werden?\n" +
                            FUNKTION_2_ANONYM + ": Anonym\n" +
                            FUNKTION_2_LAMBDA + ": Lambda\n" +
                            FUNKTION_2_NESTED + ": Nested\n" +
                            FUNKTION_2_TOP_LEVEL + ": Top-Level\n" +
                            "==>");
                    verfahren = input.nextInt();
                    input.nextLine();
                    if(verfahren==FUNKTION_2_ANONYM){
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 20);
                        System.out.println(mf.apply(zahl));
                    }
                    if (verfahren==FUNKTION_2_LAMBDA) {
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 21);
                        System.out.println(mf.apply(zahl));
                    }
                    if(verfahren==FUNKTION_2_NESTED){
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 12);
                        System.out.println(mf.apply(zahl));
                    }
                    if (verfahren==FUNKTION_2_TOP_LEVEL) {
                        MyFunctionClass mfc = new MyFunctionClass();
                        mfc.setFunktion(funktion);
                        MyFunction mf = (int zahl) -> MyFunctionClass.applyAndPrint(zahl, zahl, 22);
                        System.out.println(mf.apply(zahl));
                    }

                } else  {
                    System.out.println("0");
                }
                break;

            case ENDE:
                System.out.println("Das Programm wird beendet!");
                break;
            default:
                System.out.println(MSG_PROGRAMM_AUSWAHL);
                break;
        }
    }

    public static void main(String[] args) {
        new MyFunctionDialog().start();
    }
}
