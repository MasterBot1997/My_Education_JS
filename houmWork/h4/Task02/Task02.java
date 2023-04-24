package houmWork.h4.Task02;

import java.util.LinkedList;
import java.util.Scanner;

// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task02 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add("string");
        list.add("void");
        list.add("class");
        System.out.println(list);
        list = enqueue(1, list);
        System.out.println(list);
        String string = first(list);
        System.out.println(string);
        list = dequeue(list);
        System.out.println(list);

        

        sc.close();
    }

    static LinkedList<String> enqueue(int i, LinkedList<String> lst){
        lst.add(lst.size(), lst.get(i));
        lst.remove(i);
        return lst;
    }

    static LinkedList<String> dequeue(LinkedList<String> lst){
        lst.remove(0);
        return lst;
    }

    static String first(LinkedList<String> lst){
        String str = lst.get(0);
        return str;
    }
}
