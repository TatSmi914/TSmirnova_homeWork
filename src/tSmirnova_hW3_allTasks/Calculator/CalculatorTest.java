package tSmirnova_hW3_allTasks.Calculator;

public class CalculatorTest {

    static Calculator calculator;

    static void getSumTest() {
        if (calculator.getSum() == calculator.getFirstNumber() + calculator.getSecondNumber()) {
            System.out.println("getSum PASSED : expected - " + (calculator.getFirstNumber() + calculator.getSecondNumber()) + " , observed: " + calculator.getSum());
        } else {
            System.out.println("getSum FAILED : expected - " + (calculator.getFirstNumber() + calculator.getSecondNumber()) + " ,observed: " + calculator.getSum());
        }
    }

    static void getSubscriptionTest() {
        if (calculator.getSubtraction() == calculator.getFirstNumber() - calculator.getSecondNumber()) {
            System.out.println("getSubscription PASSED : expected - " + (calculator.getFirstNumber() - calculator.getSecondNumber()) + " , observed: " + calculator.getSubtraction());
        } else {
            System.out.println("getSubscription FAILED : expected - " + (calculator.getFirstNumber() - calculator.getSecondNumber()) + " ,observed: " + calculator.getSubtraction());
        }
    }

    static void getMultiplicationTest() {
        if (calculator.getMultiplication() == calculator.getFirstNumber() * calculator.getSecondNumber()) {
            System.out.println("getMultiplication PASSED : expected - " + (calculator.getFirstNumber() * calculator.getSecondNumber()) + " , observed: " + calculator.getMultiplication());
        } else {
            System.out.println("getMultiplication FAILED : expected - " + (calculator.getFirstNumber() * calculator.getSecondNumber()) + " ,observed: " + calculator.getMultiplication());
        }
    }

    static void getDivisionTest() {
        if (calculator.getDivision() == calculator.getFirstNumber() / calculator.getSecondNumber()) {
            System.out.println("getDivision PASSED : expected - " + (calculator.getFirstNumber() / calculator.getSecondNumber()) + " , observed: " + calculator.getDivision());
        } else {
            System.out.println("getDivision FAILED : expected - " + (calculator.getFirstNumber() / calculator.getSecondNumber()) + " ,observed: " + calculator.getDivision());
        }
    }

    static void executeTest(double a, double b) {
        calculator = new Calculator(a, b);
        getSumTest();
        getSubscriptionTest();
        getMultiplicationTest();
        getDivisionTest();
    }
}