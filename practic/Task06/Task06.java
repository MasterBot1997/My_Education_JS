package Task06;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pol(str) ? "Это полиндром" : "Это не полиндром");
        sc.close();
    }

    static boolean pol(String stri) {
        char[] arr = stri.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}
