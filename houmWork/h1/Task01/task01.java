package Task01;

import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task01 {
    public static void main(String[] args) {
        System.out.print("Введите число n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        int m = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            m *= arr[i];
        }

        // Вывод вычисления треугольного числа
        for (int i : arr) {
            if (i == arr.length) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d + ", i);
            }
        }
        System.out.printf("%d\n", s);

        // Вывод факториала
        for (int i : arr) {
            if (i == arr.length) {
                System.out.printf("%d = ", i);
            } else {
                System.out.printf("%d * ", i);
            }
        }
        System.out.printf("%d\n", m);

        sc.close();
    }
}
