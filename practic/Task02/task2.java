package Task02;

// Пример с классическим циклом фор
public class task2 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count += 1;
                if (count > max) {
                    max = count;
                }
            }
        
        }
        System.out.println(max);
    }
}


// Пример с фор ич(тут условие что мы проходим по каждом айтему массива)
// public class task2 {
//     public static void main(String[] args) {
//         int[] arr = { 1, 1, 0, 1, 1, 1 };
//         int max = 0;
//         int count = 0;
//         for (int item : arr) {
//             if (item == 1) {
//                 count++;
//                 if(max<count){
//                     max = count;
//                 }
            
//             } else {
//                 count = 0;
//             }
//         }
//         System.out.println(max);
//     }
// }