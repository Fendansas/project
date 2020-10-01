package by.danilchik;

import java.util.InputMismatchException;

public class MainCal {
    public static void main(String[] args) {
        CalculatorInterface calculatorInterface = new CalculatorInterface();
        int x =1;
        while (x==1) {
            try {
                calculatorInterface.cal();
                x=0;
            } catch (InputMismatchException e) {
                System.out.println("You may only enter integers. Try again.");
                x=1;

            }
        }

    }
}
