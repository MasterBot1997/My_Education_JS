package houmWork.h4.Task01;

import java.util.LinkedList;
import java.util.Scanner;

// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = newList(sc);

        System.out.print("LinckedList до -> ");
        System.out.println(list);
        System.out.print("LinckedList после -> ");
        System.out.println(reversList(list));

        sc.close();

    }

    // Метод для реверса линкед листа, получилось реализовать
    // только при создании нового листа внутри цикла
    static LinkedList<String> reversList(LinkedList<String> lst) {
    LinkedList<String> reversLst = new LinkedList<>();
    for (int i = lst.size() - 1; i >= 0; i--) {
    reversLst.add(lst.get(i));
    }
    return reversLst;
    }

    // Для теста разного содержимого и разной длины листа создал отель метод
    // создания листа с размером и вводом элементов от пользователя
    static LinkedList<String> newList(Scanner scan) {
        LinkedList<String> newLst = new LinkedList<>();
        System.out.println("Введите сколько элементов хотите добавить: ");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            newLst.add(scan.next());
        }
        return newLst;
    }
}
