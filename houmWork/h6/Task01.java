package houmWork.h6;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    private static NoteBook notebook1 = new NoteBook("MSI", "Katana", 17, "Intel core", 3, 1024,
            "Nvidia", 8192, "Windows 11", "Black");
    private static NoteBook notebook2 = new NoteBook("ASUS", "ROG Strix", 16, "Intel core", 5, 2048,
            "Intel", 4096, "Windows 11", "Red");
    private static NoteBook notebook3 = new NoteBook("MSI", "Ninja", 15, "Intel core", 9, 4096,
            "Nvidia", 8192, "Linux", "White");
    private static NoteBook notebook4 = new NoteBook("Acer", "Aspire V nitro", 16, "Intel core", 7, 2048,
            "Nvidia", 4096, "Windows 11", "Black");
    private static NoteBook notebook5 = new NoteBook("Acer", "Aspire V nitro", 17, "Intel core", 3, 2048,
            "AMD", 4096, "Windows 10", "Red");
    private static NoteBook notebook6 = new NoteBook("ASUS", "ROG Strix", 15, "Intel core", 7, 4096,
            "Nvidia", 2048, "Windows 11", "Black");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<NoteBook> listNoteBook = newList();
        System.out.println(
                "Введите цифру c соответствущим критерием фильтрации:\n" +
                        "1 - Происзводитель ноутбука\n" +
                        "2 - Модель ноутбука\n" +
                        "3 - Диагональ экрана\n" +
                        "4 - Производитель процессора\n" +
                        "5 - Серия процессора\n" +
                        "6 - Размер памяти\n" +
                        "7 - Производительн видеокарты\n" +
                        "8 - Оперативная память\n" +
                        "9 - Операционная система\n" +
                        "10 - Цвет ноутбука\n");

        String option = sc.next();

        switch (option) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                break;
            case "10":
                break;

            default:
                break;
        }

        // for (int i = 0; i < listNoteBook.size(); i++) {
        // if (listNoteBook.get(i).getName() == "MSI")
        // System.out.println(listNoteBook.get(i));

        // }

        sc.close();
    }

    static LinkedList<NoteBook> newList() {
        LinkedList<NoteBook> lst = new LinkedList<>();

        lst.addLast(notebook1);
        lst.addLast(notebook2);
        lst.addLast(notebook3);
        lst.addLast(notebook4);
        lst.addLast(notebook5);
        lst.addLast(notebook6);
        return lst;
    }
}
