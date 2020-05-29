package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFunctionClassTest {
        @Test
        public void applyAndPrintQuadratAnonymTest1() {
            int actual =  MyFunctionClass.applyAndPrint(1, 2, 10);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratAnonymTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 10);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratAnonymTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 10);
            int expected = 25;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetAnonymTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 20);
            int expected = 3;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetAnonymTest2(){
            int actual = MyFunctionClass.applyAndPrint(4, 1, 20);
            int expected = 33;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetAnonymTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 20);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3xHochXPlusEinsAnonymTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 30);
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint33xHochXPlusEinsAnonymTTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 30);
            int expected = 1114;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint33xHochXPlusEinsAnonymTTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 30);
            int expected = 1105;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboAnonymTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 40);
            int expected = 2;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboAnonymTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 40);
            int expected = 7;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboAnonymTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 40);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 11);
            int expected = 5;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 11);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintQuadratLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 11);
            int expected = 25;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest1() {
            int actual = MyFunctionClass.applyAndPrint(1, 2, 21);
            int expected = 3;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(4, 1, 21);
            int expected = 33;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFakultaetLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 21);
            int expected = 30;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 31);
            int expected = 9;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 31);
            int expected = 1114;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrint3LambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 31);
            int expected = 1105;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest1(){
            int actual = MyFunctionClass.applyAndPrint(1, 2, 41);
            int expected = 2;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest2(){
            int actual = MyFunctionClass.applyAndPrint(1, 4, 41);
            int expected = 7;
            assertEquals(expected, actual);
        }

        @Test
        public void applyAndPrintFiboLambdaTest3(){
            int actual = MyFunctionClass.applyAndPrint(3, 4, 41);
            int expected = 5;
            assertEquals(expected, actual);
        }

}