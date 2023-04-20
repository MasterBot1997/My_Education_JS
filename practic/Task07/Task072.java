package Task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task072 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList("Venus", 2, "Jupiter", "Mercury", 10, "Earth", 5, "Mars",
                "Saturn"));

        System.out.println(list);

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
