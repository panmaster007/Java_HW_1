// Реализовать простой калькулятор (+-/*)

import java.util.Scanner;
import java.io.IOException;

public class Task_3 {
    public static void main(String[] args) {
        double result;
        boolean endOut = false;
        char oper;
        System.out.println("-----------------------------------------------");
        Scanner sc = new Scanner(System.in);

        // System.out.println("-----------------------------------------------");

        while (endOut != true) {
            System.out.printf("Введите первое число: ");
            double numA = sc.nextDouble();

            System.out.printf("Введите символ операции которую хотите совершить ('+','-','*','/'): ");
            oper = sc.next().charAt(0);

            System.out.printf("Введите второе число: ");
            double numB = sc.nextDouble();
            System.out.println();

            switch (oper) {
                case '+':
                    result = numA + numB;
                    System.out.printf("%.2f %c %.2f = %.2f\n", numA, oper, numB, result);
                    break;
                case '-':
                    result = numA - numB;
                    System.out.printf("%.2f %c %.2f = %.2f\n", numA, oper, numB, result);
                    break;
                case '*':
                    result = numA * numB;
                    System.out.printf("%.2f %c %.2f = %.2f\n", numA, oper, numB, result);
                    break;
                case '/':
                    result = numA / numB;
                    System.out.printf("%.2f %c %.2f = %.2f\n", numA, oper, numB, result);
                    break;
                default:
                    endOut = true;
                    break;
						  
            }
            System.out.println("-----------------------------------------------");
            System.out.printf("Продолжить? ('y' or 'Y'): ");
            oper = sc.next().charAt(0);
            //if(opChar != 'y') getOut = true;
            if (oper == 'y' || oper == 'Y') {
                endOut = false;
            } else endOut = true;
        }
        System.out.println();
        sc.close();
        
    }
}	
