package com.softuni.entities;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Calculator() {
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public double calculateResult() {
        double result=0;
        switch (operator) {
            case "+":
                result=leftOperand+rightOperand;
                break;
            case "-":
                result=leftOperand-rightOperand;
                break;
            case "*":
                result=leftOperand*rightOperand;
                break;
            case "/":
                result=leftOperand/rightOperand;
                break;
            case "pow":
                result=Math.pow(leftOperand,rightOperand);
                break;
        }
        return result;
    }
}
