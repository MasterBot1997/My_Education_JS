package houmWork.h5.Task03;

import java.util.Arrays;
// import java.util.Random;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class Task03 {
    public static void main(String[] args) {
        String[][] table = new String[8][8];
        // Random rnd = new Random();
        // int firstMoveI = rnd.nextInt(8);
        // int firstMoveJ = rnd.nextInt(8);

        int firstMoveI = 4;
        int firstMoveJ = 5;

        // Два цикла создания и печати доски c первым ферзем
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == firstMoveI && j == firstMoveJ) {
                    table[i][j] = "X";
                } else {
                    table[i][j] = "0";
                }

            }
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.deepToString(table[i]));
        }
    }


    // j -колонна
    // i - строка
    static boolean check(String[][] tableCheck){
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < tableCheck.length; i++) {
            for (int j = 0; j < tableCheck.length; j++) {
                if (i == 0){
                    
                }
            }
        }
        return true;
    }
}
