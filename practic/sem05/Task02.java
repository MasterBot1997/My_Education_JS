package sem05;

import java.util.HashMap;
import java.util.Map;

// Даны 2 строки, написать метод, который вернет true, 
// если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно 
// заменить на некоторую букву во втором слове, при этом

// 1. повторяющиеся буквы одного слова меняются на одну и ту же 
// букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. 
// (Например, note - code)

// Пример 1:

// Input: s = "foo", t = "baar"
// Output: false

// Пример 2:

// Input: s = "paper", t = "title"
// Output: true

public class Task02 {
    public static void main(String[] args) {
        String a = "paper";
        String b = "title";
        System.out.println(isom(a, b));
    }

    static boolean isom(String fist, String sec) {
        if (fist.length() != sec.length()) {
            return false;
        }
        Map<Character, Character> dict = new HashMap<>();

        for (int i = 0; i < fist.length(); i++) {
            if (dict.containsKey(fist.charAt(i))) {
                if (dict.get(fist.charAt(i)) != sec.charAt(i)) {
                    return false;
                }
            } else {
                dict.put(fist.charAt(i), sec.charAt(i));
            }
        }
        return true;
    }
}
