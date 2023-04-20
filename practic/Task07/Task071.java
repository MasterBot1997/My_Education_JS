package Task07;

import java.util.ArrayList;
import java.util.Random;

public class Task071 {
    public static void main(String[] args) {
        // ArrayList<String> planats = new ArrayList<>(Arrays.asList("Venus", "Jupiter",
        // "Mercury",
        // "Earth", "Mars", "Saturn"));

        ArrayList<String> planats = new ArrayList<>();
        String[] origin = { "Venus", "Jupiter", "Mercury",
                "Earth", "Mars", "Saturn" };

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            planats.add(origin[random.nextInt(6)]);
        }
        System.out.println(planats);
        ;

        int count = 1;
        planats.sort(null);
        for (int i = 1; i < planats.size(); i++) {
            if (planats.get(i) == planats.get(i - 1)) {
                count++;
            } else {
                System.out.printf(" %s - %d \n", planats.get(i - 1), count);
                count = 1;
            }
        }
        System.out.printf(" %s - %d \n", planats.get(planats.size() - 1), count);
    }
}
