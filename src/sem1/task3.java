package sem1;

import java.util.Scanner;

//Реализовать простой калькулятор
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Enter number1: ");
        double c1 = iScanner.nextDouble();
        System.out.printf("Enter number2: ");
        double c2 = iScanner.nextDouble();
        System.out.printf("Enter '+-/*': ");
        String n = iScanner.next();
        double result = 0;
        switch (n){
            case "+": result = c1+c2;
            break;
            case "-": result = c1-c2;
            break;
            case "*": result = c1*c2;
                break;
            case "/": result = c1/c2;
                break;
            default:
                System.out.println("Операция не поддерживается");
                return;
        }
        System.out.printf("c1 %s c2: %s %s %s = %s\n",
                n,
                c1,
                n,
                c2,
                result);
    }

}
