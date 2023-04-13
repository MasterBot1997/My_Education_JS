package Task01;

import java.util.Scanner;

public class lib {
    static int data(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Number: ");
        int a = sc.nextInt();
        sc.close();
        return a;
    }
    static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}