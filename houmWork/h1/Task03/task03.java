package Task03;

import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите символ операции: ");
        String simb = sc.next();
        switch (simb) {
            case "+":
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.sum(num1, num2));
                break;
            case "-":
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.sum(num1, num2));
                break;
            case "*":
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.sum(num1, num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.div(num1, num2));
                } else {
                    System.out.println("В знаменателе не может быть 0!");
                }
                break;
            default:
                System.out.println("Неверный символ операции");
                break;
        }
        sc.close();
    }
}
