package packageCalculator;

import static packageCalculator.Operations.*;

public class Determination {
    private String consoleTask;


    public Determination() {

    }

    public String getConsoleTask() {
        return consoleTask;
    }

     public void taskDetermination(String consoleTask) {






        String[] strArr; //объявляю массив
        strArr = consoleTask.split("\\s"); //заполняю массив из строки поэлементно через пробел
        double numberOne = 0;
        double numberTwo = 0;
        char operation = ' ';

        numberOne = Double.parseDouble(strArr[0]); //распарсила нулевой элемент массива в число
        operation = strArr[1].charAt(0); //определяет тип операции
        numberTwo = Double.parseDouble(strArr[2]); //распарсила второй элемент массива в число


        Operations task = new Operations(numberOne, numberTwo, operation);


        switch (operation) {


            case '+': {
                double resultOfAddition = getAddition(task.getNumberOne(), task.getNumberTwo());

            }
            break;


            case '-': {
                double resultOfSubtraction = getSubtraction(task.getNumberOne(), task.getNumberTwo());
            }
            break;

            case '/': {
                try {
                    double resultOfDivision = getDivision(task.getNumberOne(), task.getNumberTwo());
                } catch (Exception e) { //ловлю исключение
                    System.err.println(e.getMessage()); //делить на ноль нельзя
                }
            }
            break;

            case '*': {
                double resultOfMultiplication = getMultiplication(task.getNumberOne(), task.getNumberTwo());
            }
            break;

            default:
                System.out.println("Invalid choice"); //выбор отличается от возможных операций
        }
    }

}