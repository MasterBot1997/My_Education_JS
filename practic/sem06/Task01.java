package sem06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

public class Task01 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        LinkedHashSet<Integer> linckHash = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));

        System.out.printf("Это Хеш Сэт: %s \n", hash);
        System.out.printf("Это Хеш Линк Сэт: %s \n", linckHash);
        System.out.printf("Это Три Сэт: %s \n", treeSet);
    }
}
