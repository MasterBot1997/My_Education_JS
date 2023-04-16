package Task03;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task03 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Task03.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите символ операции: ");
        String simb = sc.next();
        switch (simb) {
            case "+":
                logger.info(num1 + " " + simb + " " + num2 + " = " + calcOp.sum(num1, num2));
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.sum(num1, num2));
                break;
            case "-":
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.dif(num1, num2));
                break;
            case "*":
                System.out.printf("%d %s %d = %d", num1, simb, num2, calcOp.mult(num1, num2));
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
