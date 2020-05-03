package tSmirnova_hW3_allTasks.Calculator;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    double getSum() {
        return firstNumber + secondNumber;
    }

    double getSubtraction() {
        return firstNumber - secondNumber;
    }

    double getMultiplication() {
        return firstNumber * secondNumber;
    }

    double getDivision() {
        return firstNumber / secondNumber;
    }
}