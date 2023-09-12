package org.example;

public class Division implements Operation{
    @Override
    public double getResult(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        return 0.0;
    }
}
