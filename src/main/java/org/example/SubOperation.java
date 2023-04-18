package org.example;

public class SubOperation implements Operation{
    private final double num1;
    private final double num2;
    private double result;
    @Override
    public Operation process() {
        this.result = num1-num2;
        return this;
    }

    @Override
    public double getResult() {
        return this.result;
    }

    public SubOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
