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
        return this.firstNumber + this.secondNumber;
    }

    double getSubtraction() {
        return this.firstNumber - this.secondNumber;
    }

    double getMultiplication() {
        return this.firstNumber * this.secondNumber;
    }

    double getDivision() {
        return this.firstNumber / this.secondNumber;
    }
}