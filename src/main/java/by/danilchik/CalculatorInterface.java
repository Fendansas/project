package by.danilchik;

import java.util.Scanner;

public class CalculatorInterface {
    private Calculator calculator = new Calculator();

    private Scanner scanner = new Scanner(System.in);
    private int number;

    private String answer = "Answer = ";

    public void cal() {
        int x = 10;
        while (x > 5) {
            System.out.println(" 1 -> сложение  (+)");
            System.out.println(" 2 -> вычитание (-)");
            System.out.println(" 3 -> умножение (*)");
            System.out.println(" 4 -> делеие    (/)");
            System.out.println(" 5 -> квадратный корень (+)");
            System.out.println(" 0 -> exit");

            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println(answer + calculator.plus());
                    x = 10;
                    break;
                case 2:
                    System.out.println(answer + calculator.minus());
                    x = 10;
                    break;
                case 3:
                    System.out.println(answer + calculator.multiply());
                    x = 10;
                    break;
                case 4:
                    System.out.println(answer + calculator.share());
                    x=10;
                    break;
                case 5:
                    System.out.println(answer + calculator.SquareRoot());
                    x=10;
                    break;
                case 0:
                    System.out.println("good by");
                    x = 0;
            }
        }

    }
}
