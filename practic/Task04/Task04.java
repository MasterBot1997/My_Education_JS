package Task04;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, 
// начиная с c1.
// N -> 6
// symb -> a b
// console -> ababab

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String fc = sc.next();
        String sch = sc.next();
        System.out.println(str(n, fc, sch));
        sc.close();
    }

    // static String str(int num, String firstChar, String secondChar) {
    //     StringBuilder res = new StringBuilder();
    //     String twoChach = firstChar + secondChar;
    //     if (num % 2 == 0) {
    //         for (int i = 0; i < num / 2; i++) {
    //             res.append(twoChach);
    //         }
    //     } else {
    //         for (int i = 0; i < num; i++) {
    //             if (i % 2 == 0) {
    //                 res.append(firstChar);
    //             } else {
    //                 res.append(secondChar);
    //             }
    //         }
    //     }
    //     return res.toString();
    // }

    static String str(int num, String firstChar, String secondChar) {
        StringBuilder res = new StringBuilder();
        if (num % 2 == 0) {
            for (int i = 0; i < num / 2; i++) {
                res.append(firstChar).append(secondChar  );
            }
        } else {
            for (int i = 0; i < num; i++) {
                if (i % 2 == 0) {
                    res.append(firstChar);
                } else {
                    res.append(secondChar);
                }
            }
        }
        return res.toString();
    }
}
