// Как будто название корневой папки 'является рабочей средой'
package java_project;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
// Поиграть с инкреметом и дикрементом
// public class program {
//     public static void main(String[] args) {
//         int a = 2;
//         a = a-- - --a;
//         System.out.println(a);
//         System.out.println(a);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         lib.sayHi();
//     }

// }

// Пример получения данных от пользователя из консоли
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//     } 
// }

// пример вычисления с получением данных через метод
// public class program {
//     public static void main(String[] args) {
//         int a = lib.data(), b = lib.data();
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     } 
// }

// пример вычисления с получением данных через метод
// public class program {
//     public static void main(String[] args) {
//         int a = lib.data(), b = lib.data();
//         int c = a + b;
//         String res = String.format("%d + %d = %d", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     } 
// }

// public class program {
//     public static void main(String[] args) {
//         int b = 2;
//         {
//             int a = 3;
//             System.out.println(a);
//             System.out.println(a + b);
//         }
//         int a = 4;
//         System.out.println(a);
//         System.out.println(a + b);
//     } 
// }


// Работа с файлами
public class program {
    public static void main(String[] args) throws IOException {
       try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.append("line 3");
            fw.flush();
       }
    } program (IOException ex) {
        System.out.println(ex.getMessage());
} }