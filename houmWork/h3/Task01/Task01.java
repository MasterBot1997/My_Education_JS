package houmWork.h3.Task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = newArrayList(sc);
        System.out.println("Исходный список -> " + list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список только с нечетными числами -> " + list);
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
