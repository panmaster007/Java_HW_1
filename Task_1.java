// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task_1 {
    static int fact (int n) {
        if (n == 1) return 1;
        else return n * fact(n-1);
    }
    static int threeNum (int n) {
        if (n == 1) return 1;
        else return n + threeNum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.printf("Введите число: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("число = " + num);
        System.out.println();
        System.out.println("факториал от " + num + " равняется " + fact(num));
        System.out.println("треугольное число от " + num + " равняется " + threeNum(num));
        System.out.println();
        
    }
}