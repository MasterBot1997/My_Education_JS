package Task05;

// Напишите метод, который сжимает строку.

// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

public class Task05 {
    public static void main(String[] args) {
        String text = "aaaabbbcddaaa";
        System.out.println(rleCoding(text));
    }

    static String rleCoding(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char[] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                count++;
            } else {
                res.append(charArray[i - 1]);
                if (count != 1) {
                    res.append(count);
                }
                count = 1;
            }
        }
        res.append(charArray[charArray.length - 1]);
        if (count != 1)
            res.append(count);
         
        return res.toString();
    }
}
