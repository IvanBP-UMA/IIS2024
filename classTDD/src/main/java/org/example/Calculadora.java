package org.example;

import java.util.ArrayList;
public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    ArrayList<Integer> lista;
}
