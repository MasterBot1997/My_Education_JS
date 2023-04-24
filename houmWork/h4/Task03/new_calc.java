package houmWork.h4.Task03;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class new_calc {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(new_calc.class.getName());
        FileHandler fh = new FileHandler("houmWork/h4/Task03/log_new_calc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        System.out.println(
                "\nКомманды для пользования калькулятором:\n+-/* - символы для вычеслительных операций, введите символ нужный вам для операции\nback - отмена последнего вычисления\nstop - завершение работы калькулятора\n");
        Scanner sc = new Scanner(System.in);
        String command = "";
        int num2 = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        while (!command.equals("stop")) {
            System.out.println("Введите комманду того то вы хотите сделать: ");
            command = sc.next();
            if (!command.equals("stop")) {
                int num1 = number1(sc, dq);
                if (!command.equals("back")) {
                    System.out.println("Введите второе число: ");
                    num2 = sc.nextInt();
                }

                switch (command) {
                    case "+":
                        dq.addFirst(sum(num1, num2));
                        logger.info(num1 + " " + command + " " + num2 + " = " + sum(num1, num2));
                        break;
                    case "-":
                    dq.addFirst(dif(num1, num2));
                        logger.info(num1 + " " + command + " " + num2 + " = " + dif(num1, num2));
                        break;
                    case "*":
                        dq.addFirst(mult(num1, num2));
                        logger.info(num1 + " " + command + " " + num2 + " = " + mult(num1, num2));
                        break;
                    case "/":
                        if (num2 != 0) {
                            dq.addFirst(div(num1, num2));
                            logger.info(num1 + " " + command + " " + num2 + " = " + div(num1, num2));
                        } else {
                            logger.warning("The denominator cannot be 0!");
                        }
                        break;
                    case "back":
                        if (dq.size() != 0) {
                            dq.removeFirst();
                            if (dq.size() == 0) logger.info("Command back. Wrlckom to start)");
                            else logger.info("Command back number 1 = " + dq.getFirst());
                        }
                        break;
                    default:
                        logger.warning("Not command!");
                        break;
                }
            }
        }
        sc.close();
    }

    // Проверка первого числа, если это первая операция
    // то будет запрос ввода от пользователя, иначе
    // вернется результат предидущей операции
    static Integer number1(Scanner scan, Deque<Integer> st) {
        int n1 = 0;
        if (st.size() == 0) {
            System.out.println("Введите первое число: ");
            n1 = scan.nextInt();
        } else {
            n1 = st.getFirst();
            System.out.printf("Первое число - %d\n", n1);
        }
        return n1;
    }


    // Ниже все операции вычисления которые раньше были в отдельном файле
    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int dif(int a, int b) {
        int c = a - b;
        return c;
    }

    static int mult(int a, int b) {
        int c = a * b;
        return c;
    }

    static int div(int a, int k) {
        int c = a / k;
        return c;
    }

}
