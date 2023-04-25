package sem05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Создать структуру для хранения Номеров паспортов и 
// Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

public class Task01 {
    public static void main(String[] args) {
        Map<Integer, String> pass = new HashMap<>();

        pass.put(123456, "Иванов");
        pass.put(321456, "Васильев");
        pass.put(234561, "Петрова");
        pass.put(234432, "Иванов");
        pass.put(654321, "Петрова");
        pass.put(345678, "Иванов");

        for (Entry<Integer, String> kv : pass.entrySet()) {
            if (kv.getValue().equals("Иванов"))
                System.out.println(kv.getKey() + " " + kv.getValue());
        }

    }
}
