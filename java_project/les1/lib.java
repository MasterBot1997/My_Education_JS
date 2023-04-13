package java_project.les1;

import java.util.Scanner;

public class lib {
    static void sayHi(){
        System.out.println("hi");
    }
    static int data(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Number: ");
        Integer number = iScanner.nextInt();
        iScanner.close();
        return number;
    }
}

