package houmWork.h2.Task01;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task01 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] arr = {8,5,4,9,7};
        int temp = 0;

        Logger logger = Logger.getLogger(Task01.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println();
                    // лог с возвращаемой строкой из метода ниже
                    // logger.log(Level.INFO, Task01.strArray(arr));
                    logger.log(Level.INFO, Arrays.toString(arr));
                }
            }
        }
        System.out.println();
    }
}