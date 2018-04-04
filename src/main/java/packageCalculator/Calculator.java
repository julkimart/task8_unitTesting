package packageCalculator;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an expression with spaces: "); //введите пример с пробелами

        String expression = scanner.nextLine();

        Determination task = new Determination();
        task.taskDetermination(expression);


    }
}