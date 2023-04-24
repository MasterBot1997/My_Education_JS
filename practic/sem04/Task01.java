package sem04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (!str.equals("stop")) {
            System.out.println("Enter the string: ");
            str = sc.nextLine();
            if (str.contains("print~")) {
                System.out.println(list.get(Integer.parseInt(str.split("~")[1])));
            } else {
                list.add(str);
            }
        }

        sc.close();
    }
}
