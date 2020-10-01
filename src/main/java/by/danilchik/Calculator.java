package by.danilchik;

import java.util.Scanner;

class Calculator {
    private String number1 = "input number 1";
    private String number2 = "input number 2";

    double plus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(number1);
        double x = scanner.nextDouble();
        System.out.println(number2);
        double y = scanner.nextDouble();
        return x + y;
    }

    double minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(number1);
        double x = scanner.nextDouble();
        System.out.println(number2);
        double y = scanner.nextDouble();
        return x - y;
    }

    double multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(number1);
        double x = scanner.nextDouble();
        System.out.println(number2);
        double y = scanner.nextDouble();
        return x * y;
    }

    double share(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(number1);
        double x = scanner.nextDouble();
        System.out.println(number2);
        double y = scanner.nextDouble();
        return x / y;
    }

    double SquareRoot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(number1);
        double x = scanner.nextDouble();
        double answer = Math.sqrt(x);
        return answer;
    }







}
