package sem04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (!str.equals("stop")) {
            System.out.println("Enter the string: ");
            str = sc.nextLine();
            if (str.equals("print")){
                // Более кривой вариант
                // for (int i = dq.size() - 1; i >= 0; i--) {
                //     System.out.println(dq.removeLast());
                // }

                // Более прошаренный вариант
                while (!dq.isEmpty()) {
                    System.out.println(dq.removeLast());
                }
            } else {
                dq.addLast(str);
            }
        }

        sc.close();
    }
}
