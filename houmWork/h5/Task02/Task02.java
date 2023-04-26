package houmWork.h5.Task02;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class Task02 {
    public static void main(String[] args) {
        Map<String, String> stafList = newMap();
        Map<String, Integer> topName = new LinkedHashMap<>();
        Map<String, Integer> topNameSort = new LinkedHashMap<>();
        int count = 0;

        // В этом цикле просто счетчик имен, проблема которую не смог решить
        // это то что в список сохраняется по сути повторяющиеся элементы
        for (Entry<String, String> kv : stafList.entrySet()) {
            for (Entry<String, String> v : stafList.entrySet()) {
                if (kv.getValue() == v.getValue()) {
                    count++;
                }
            }

            topName.putIfAbsent(kv.getValue(), count);
            count = 0;

        }

        int max = 0;
        for (Entry<String, Integer> kv : topName.entrySet()) {
            if (kv.getValue() > max)
                max = kv.getValue();
        }

        for (Entry<String, Integer> kv : topName.entrySet()) {
            for (Entry<String, Integer> v : topName.entrySet()) {
                if (v.getValue() == max) {
                    if (kv.getValue() >= v.getValue() || kv.getValue() <= v.getValue()) {
                        topNameSort.putIfAbsent(v.getKey(), v.getValue());
                    }
                }
            }
            if (max == 0)
                break;
            max--;
        }

        // вывод словаря в консоль
        for (Entry<String, Integer> kv : topNameSort.entrySet()) {
        System.out.println(kv.getKey() + " " + kv.getValue());
        }

    }

    // Просто чтобы не засоряло основной код
    static Map<String, String> newMap() {
        Map<String, String> newStafList = new HashMap<>();
        newStafList.put("Иванов", "Иван");
        newStafList.put("Петрова", "Светлана");
        newStafList.put("Белова", "Кристина");
        newStafList.put("Мусина", "Анна");
        newStafList.put("Крутова", "Анна");
        newStafList.put("Юрин", "Иван");
        newStafList.put("Лыков", "Петр");
        newStafList.put("Чернов", "Павел");
        newStafList.put("Чернышов", "Петр");
        newStafList.put("Федорова", "Мария");
        newStafList.put("Светлова", "Марина");
        newStafList.put("Савина", "Мария");
        newStafList.put("Рыкова", "Мария");
        newStafList.put("Лугова", "Марина");
        newStafList.put("Владимирова", "Анна");
        newStafList.put("Мечников", "Иван");
        newStafList.put("Петин", "Петр");
        newStafList.put("Ежов", "Иван");

        return newStafList;
    }
}