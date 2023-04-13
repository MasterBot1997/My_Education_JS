package Task02;

// Вывести все простые числа от 1 до 1000

public class task02 {
    public static void main(String[] args) {
        System.out.printf("%d ", 1);
        for (int i = 2; i <= 1000; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.printf("%d ", i);
            }
        }
    }
}
