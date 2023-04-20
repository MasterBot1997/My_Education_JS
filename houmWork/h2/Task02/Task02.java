package houmWork.h2.Task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// 2. Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task02 {
    public static void main(String[] args) throws FileNotFoundException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File file = new File(pathFile);

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = Task02.newL(sc);
            System.out.println(Task02.printData(data));
        }

        sc.close();
    }

    // Через StringBuilder сплитим все значения без знаков и возвращаем строку
    static String newL(Scanner scann) {
        String line = scann.nextLine();
        String[] words = line.split(",");
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].split(":").length; j++) {
                newLine.append(words[i].split(":")[j] + " ");
            }
        }

        return newLine.toString();
    }

    static String printData(String da){
        StringBuilder printDa = new StringBuilder();
        printDa.append("Студент " + da.split(" ")[1] + " получил " + da.split(" ")[3] + " по предмету " + da.split(" ")[5]);
        return printDa.toString();
    }
}