package houmWork.h5.Task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции:
// 1) Добавление номера
// 2) Вывод всего

// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> telephones = new HashMap<>();
        System.out.println("Список комманд:\n1 - Добавление номера\n2 - Вывод всего\nstop - остановка программы");
        System.out.print("Введите команду которую хотите выполнить: ");
        String command = sc.nextLine();

        while (!command.equals("stop")) {
            switch (command) {
                case "1":
                    telephones = newNumberphone(sc, telephones);
                    break;
                case "2":
                    System.out.println(telephones);
                    break;

                default:
                    break;
            }
            System.out.print("Введите команду которую хотите выполнить: ");
            command = sc.next();
        }

        sc.close();
    }

    static Map<String, String> newNumberphone(Scanner scan, Map<String, String> newTelephones) {
        System.out.print("Введите фамилию: ");
        String lastName = scan.next();
        System.out.print("Введите номер: ");
        String numberPhone = scan.next();
        if (newTelephones.containsKey(lastName)) {
            newTelephones.put(lastName, newTelephones.get(lastName) + " " + numberPhone);
            // System.out.println(newTelephones.values());
        } else {
            System.out.println("2");
            newTelephones.put(lastName, numberPhone);
        }
        return newTelephones;
    }

    
}
