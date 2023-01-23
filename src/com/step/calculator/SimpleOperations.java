package com.step.calculator;

public class SimpleOperations {

    public void sum(int a, int b){

        int result = a + b;
        System.out.println(a + "+" + b + "=" + result);
    }

    public void difference(int a, int b){

        int result = a - b;
        System.out.println(a + "-" + b + "=" + result);
    }

    public void multiply(int a, int b){

        int result = a * b;
        System.out.println(a + "*" + b + "=" + result);
    }

    public void divide(int a, int b){

        int result = a / b;
        System.out.println(a + "/" + b + "=" + result);
    }
}
