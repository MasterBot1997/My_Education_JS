package Practic.p1.Task01;

import java.util.Scanner;

public class lib {
    static void sayHi(){
        System.out.println("hi");
    }
    static int data(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Number: ");
        Integer number = iScanner.nextInt();
        return number;
    }
}

