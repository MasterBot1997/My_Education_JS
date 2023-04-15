package houmWork.h2.Task01;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Task01 {
    public static void main(String[] args) throws SecurityException, IOException {
        // Scanner sc = new Scanner(System.in);
        // int[] arr = newArray(sc);
        // sc.close();
        int[] arr = {8,5,4,9,7};
        int temp = 0;

        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            logger.info("Сортируем значение " + arr[i]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    logger.info(arr[i] + " < " + arr[j] + "\nМеняем местами " + arr[i] + " и " + arr[j]);
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    Task01.printArray(arr);
                    System.out.println();
                }
            }
        }
        System.out.println();
        Task01.printArray(arr);

    }

    // функция создания массива через получение данных от пользователя
    static int[] newArray(Scanner scan) {
        System.out.print("Введите длину вашего массива: ");
        int n = scan.nextInt();
        int[] newArr = new int[n];
        System.out.println("Поочередно введите элементы массива: ");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = scan.nextInt();
        }
        Task01.printArray(newArr);
        return newArr;
    }

    // Функция печати массива в консоль
    static void printArray(int[] b) {
        for (int i : b) {
            System.out.printf("%d ", i);
        }
    }
}