package packageCalculator;

public class Operations {
    private Double numberOne;
    private Double numberTwo;
    private char operation;

    public Operations(Double numberOne, Double numberTwo, char operation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }


    public static Double getAddition(Double numberOne, Double numberTwo) {
        Double countAddition = numberOne + numberTwo;
        System.out.println(" = " + countAddition);
        return countAddition;
    }

    public static Double getSubtraction(Double numberOne, Double numberTwo) {
        Double countSubtraction = numberOne - numberTwo;
        System.out.println(" = " + countSubtraction);
        return countSubtraction;

    }


    public static Double getDivision(Double numberOne, Double numberTwo) throws Exception {
        if (numberTwo == 0) throw new Exception("divisor must not be zero"); //ввожу исключение
        Double countDivision = numberOne / numberTwo;
        System.out.println(" = " + countDivision);
        return countDivision;

    }


    public static Double getMultiplication(Double numberOne, Double numberTwo) {
        Double countMultiplication = numberOne * numberTwo;
        System.out.println(" = " + countMultiplication);
        return countMultiplication;
    }
}