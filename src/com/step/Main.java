package com.step;
import com.step.calculator.SimpleOperations;

public class Main {

    public static void main(String[] args) {

        SimpleOperations simpleOperations = new SimpleOperations();
        simpleOperations.sum(6,4);
        simpleOperations.difference(6,4);
        simpleOperations.multiply(6,4);
        simpleOperations.divide(6,4);
    }
}
