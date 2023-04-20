package houmWork.h3.Task02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = newArrayList(sc);
        System.out.println("Целочисленный список -> " + list);
        int min = list.get(0);
        int max = list.get(0);
        float temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp += list.get(i);
            if (list.get(i) > max)
                max = list.get(i);
            if (list.get(i) < min)
                min = list.get(i);
        }

        float arithmeticMean = temp / list.size();
        System.out.printf("Максималоно число = %d\nМинимально число = %d\nСреднее арифметическое число списка = %.2f",
                max, min, arithmeticMean);

        sc.close();
    }

    static ArrayList<Integer> newArrayList(Scanner scan) {
        ArrayList<Integer> newList = new ArrayList<>();
        Random rnd = new Random();
        System.out.println("Введите количество элеменстов списка: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            newList.add(rnd.nextInt(20));
        }
        return newList;
    }
}
