package SOLID.openClosed;

/**
 * This helps in adding new operations implementation and our
 * calculator get extensions without modifying it main task
 * that is performing calculation.
 */

interface Operation{
    int perform(int number1, int number2);
}

class AdditionOperation implements  Operation{
    @Override
    public int perform(int number1, int number2){
        return number1+number2;
    }
}

class SubtractionOperation implements  Operation{
    @Override
    public int perform(int number1, int number2){
        return number1+number2;
    }
}

class MultiplicationOperation implements  Operation{
    @Override
    public int perform(int number1, int number2){
        return number1*number2;
    }
}

class DivisionOperation implements  Operation{
    @Override
    public int perform(int number1, int number2){
        return number1+number2;
    }
}


/**
 * No Modification in our calculator functionality will be made
 * We can keep adding new extensions to create new operations
 */
class Calculator{
    public int calculateNumber(int number1, int number2,Operation operation {
        return operation.perform(number1,number2);
    }
}





public class Example2 {
}
