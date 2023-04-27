package houmWork.h5.Task03;

import java.util.Arrays;
import java.util.Random;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class Task03 {
    public static void main(String[] args) {
        String[][] table = new String[8][8];
        Random rnd = new Random();

        while (!finish(table)) {
            int firstMoveI = rnd.nextInt(8);
            int firstMoveJ = rnd.nextInt(8);
            table[firstMoveI][firstMoveJ] = "X";
            for (int j = 0; j < table.length; j++) {
                for (int i = 0; i < table.length; i++) {
                    if (check(table, i, j)) {
                        table[i][j] = "X";
                    } else if (table[i][j] == "X") {
                        continue;
                    } else {
                        table[i][j] = "0";
                    }

                }
            }
        }

        Task03.printBoard(table);

    }

    static boolean finish(String[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == "X")
                    count++;
            }
        }
        if (count == 8) {
            return true;
        }
        return false;
    }

    // проверка по всем направлениям ферзя 
    static boolean check(String[][] board, int fI, int fJ){
            // Диагональ влево вверх
            for (int i = fI, j = fJ; i>=0&&j>-1 ; i--, j--) {
                if (board[i][j]=="X"){
                    return false;
                }
            }
            // Диагональ вправо вверх
            for (int i = fI, j = fJ;  i>-1&&j <board.length; i--, j++) {
                if (board[i][j]=="X"){
                    return false;
                }
            }
            // Диагональ влево вниз
            for (int i = fI, j = fJ; i<board.length&&j>-1 ; i++, j--) {
                if (board[i][j]=="X"){
                    return false;
                }
            }
            // Диагональ вправо вниз
            for (int i = fI, j = fJ;  i<board.length&&j <board.length; i++, j++) {
                if (board[i][j]=="X"){
                    return false;
                }
            }
            // Вертикаль
            for (int i = 0;  i<board.length; i++) {
                if (board[i][fJ]=="X"){
                    return false;
                }
            }
            // горизонталь
            for (int j = 0;  j <board.length; j++) {
                if (board[fI][j]=="X"){
                    return false;
                }
            }
        return true;
    }

    // Принт доски 
    static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.deepToString(board[i]));
        }
    }
}