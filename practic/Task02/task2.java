package Task02;

public class task2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
