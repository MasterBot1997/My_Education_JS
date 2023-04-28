package sem06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longArray = sc.nextInt();
        Random rnd = new Random();
        ArrayList<Integer> list = newList(rnd, longArray);
        found(list);
        sc.close();
    }



    static ArrayList<Integer> newList(Random random, int scan){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < scan; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    }

    static void found(ArrayList<Integer> arrayList){
        HashSet<Integer> arrSet = new HashSet<>(arrayList);
        System.out.printf("%.2f", Double.valueOf(arrSet.size())*100/arrayList.size());
    }
}
