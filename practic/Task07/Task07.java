package Task07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int index = 0; index < 10; index++) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

}