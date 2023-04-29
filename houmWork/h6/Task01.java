package houmWork.h6;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    private static NoteBook notebook1 = new NoteBook("MSI", "Katana", 17, "Intel core i3", 1024,
            "Nvidia", 512, "Windows 11", "Black");
    private static NoteBook notebook2 = new NoteBook("ASUS", "ROG Strix", 16, "Intel core i5", 2048,
            "Intel", 4096, "Windows 11", "Red");
    private static NoteBook notebook3 = new NoteBook("MSI", "Ninja", 15, "Intel core i9", 4096,
            "AMD", 8192, "Linux", "White");
    private static NoteBook notebook4 = new NoteBook("Acer", "Aspire V nitro", 16, "Intel core i7", 2048,
            "Nvidia", 1024, "Windows 11", "Black");
    private static NoteBook notebook5 = new NoteBook("Acer", "Aspire V nitro", 14, "Intel core i3", 512,
            "AMD", 4096, "Windows 10", "Red");
    private static NoteBook notebook6 = new NoteBook("ASUS", "ROG Strix", 15, "Intel core i7", 128,
            "Nvidia", 2048, "Windows 11", "Black");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<NoteBook> listNoteBook = newList();
        LinkedList<NoteBook> sort = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим критерием фильтрации:\n" +
                        "1 - Происзводитель ноутбука\n" +
                        "2 - Модель ноутбука\n" +
                        "3 - Диагональ экрана\n" +
                        "4 - Процессор\n" +
                        "5 - Размер памяти\n" +
                        "6 - Производитель видеокарты\n" +
                        "7 - Оперативная память\n" +
                        "8 - Операционная система\n" +
                        "9 - Цвет ноутбука\n");

        System.out.print("Введите цифру сортировки: ");
        String option = sc.next();

        switch (option) {
            case "1":
                sort = sortBrand(listNoteBook, sc);
                System.out.println("Результат поиска: ");
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "2":
                sort = sortModel(listNoteBook, sc);
                System.out.println("Результат поиска: ");
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "3":
                sort = sortSizeDp(listNoteBook, sc);
                System.out.println("Результат поиска: ");
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "4":
                sort = sortCpu(listNoteBook, sc);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "5":
                sort = sortMemorySize(listNoteBook, sc, option);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "6":
                sort = sortGpu(listNoteBook, sc);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "7":
                sort = sortMemorySize(listNoteBook, sc, option);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "8":
                sort = sortOs(listNoteBook, sc);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
                break;

            case "9":
                sort = sortColor(listNoteBook, sc);
                for (int i = 0; i < sort.size(); i++) {
                    System.out.println(sort.get(i));
                }
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

    // Метод сортировки по производителю
    static LinkedList<NoteBook> sortBrand(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Диагональ 15\n" +
                        "2 - Диагональ 16\n" +
                        "3 - Диагональ 17\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getBrand() == "MSI")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getBrand() == "ASUS")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getBrand() == "Acer")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
    }

    // Метод сортировки по модели
    static LinkedList<NoteBook> sortModel(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Katana\n" +
                        "2 - Ninja\n" +
                        "3 - ROG Strix\n" +
                        "4 - Aspire V nitro\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getModel() == "Katana")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getModel() == "Ninja")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getModel() == "ROG Strix")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "4":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getModel() == "Aspire V nitro")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
    }

    // Метод сортировки по размеру экрана
    static LinkedList<NoteBook> sortSizeDp(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println("Укажите минимальный и максимальный размер диагонали");
        System.out.print("Минимальная диагональ: ");
        int minSize = scan.nextInt();
        System.out.print("Максимальная диагональ: ");
        int maxSize = scan.nextInt();

        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).getSizeDp() >= minSize && lst.get(i).getSizeDp() <= maxSize)
                sortB.addLast(lst.get(i));

        }

        return sortB;
    }

    // Метод сортировки по Процессору
    static LinkedList<NoteBook> sortCpu(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Intel core i3\n" +
                        "2 - Intel core i5\n" +
                        "3 - Intel core i7\n" +
                        "4 - Intel core i9\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getCpu() == "Intel core i3")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getCpu() == "Intel core i5")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getCpu() == "Intel core i7")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "4":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getCpu() == "Intel core i9")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
    }

    // Метод сортировки по размеру памяти
    static LinkedList<NoteBook> sortMemorySize(LinkedList<NoteBook> lst, Scanner scan, String op) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println("Укажите минимальный и максимальный размер памяти");
        System.out.print("Минимальная размер: ");
        int minSize = scan.nextInt();
        System.out.print("Максимальная размер: ");
        int maxSize = scan.nextInt();

        if (op == "5") {
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getMemorySize() >= minSize && lst.get(i).getMemorySize() <= maxSize)
                    sortB.addLast(lst.get(i));

            }
        } else {
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getRam() >= minSize && lst.get(i).getRam() <= maxSize)
                    sortB.addLast(lst.get(i));

            }
        }

        return sortB;
    }

    // Метод сортировки по Производителю видеокарты
    static LinkedList<NoteBook> sortGpu(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Nvidia\n" +
                        "2 - Intel\n" +
                        "3 - AMD\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getGpu() == "Nvidia")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getGpu() == "Intel")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getGpu() == "AMD")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
    }

    // Метод сортировки по Операционной системе
    static LinkedList<NoteBook> sortOs(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Windows 11\n" +
                        "2 - Windows 10\n" +
                        "3 - Linux\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getOs() == "Windows 11")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getOs() == "Windows 10")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getOs() == "Linux")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
    }

    static LinkedList<NoteBook> sortColor(LinkedList<NoteBook> lst, Scanner scan) {
        LinkedList<NoteBook> sortB = new LinkedList<>();
        System.out.println(
                "Введите цифру c соответствущим названию производителя:\n" +
                        "1 - Black\n" +
                        "2 - Red\n" +
                        "3 - White\n");
        String sortOption = scan.next();
        switch (sortOption) {
            case "1":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getColor() == "Black")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "2":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getColor() == "Red")
                        sortB.addLast(lst.get(i));
                }
                break;

            case "3":
                for (int i = 0; i < lst.size(); i++) {
                    if (lst.get(i).getColor() == "White")
                        sortB.addLast(lst.get(i));
                }
                break;

            default:
                break;
        }
        return sortB;
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
