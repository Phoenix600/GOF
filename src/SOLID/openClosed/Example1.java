package SOLID.openClosed;

/**
 * OPEN Close Principle
 * Any class or any interface should be close for modifications and extension should be allowed
 */

// Bad Example

/**
 * THis is a bad example where we are taking operation type
 * and for each operation type we are having cases
 * now if we want to introduce the division, we have to modify the
 * calculator
 */
class BadCalculator{
    public int calculatorNumber(int number1, int number2, String type){
        int result = 0;
        switch(type){
            case "sum":
                    result = number1 + number2;
                    break;
            case "sub":
                    result = number1 - number2;
                    break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        return result;
    }
}

public class Example1 {
}
