package sem2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class Task2 {
    public static final Logger logger = Logger.getLogger(Task2.class.getName());
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("logs/s2_Task2_log.lck");
        SimpleFormatter sf = new SimpleFormatter();
        fileHandler.setFormatter(sf);
        logger.addHandler(fileHandler);


        logger.info("start program");

        //1 задать массив чисел
        int[] ints = {9,8,7,6,5,4,3};
        //2 реализовать сортировку
        bubbleSorter(ints);
        //3 вывести отсортированный массив


        logger.info("end program");

    }
    public static void bubbleSorter(int[] ints){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        logger.info("bubbleSorter start: " + Arrays.toString(ints));
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = ints.length - 1; j > i; j--) {
                if (ints[j - 1] > ints[j]) {
                    int tmp = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = tmp;
                }

            }
            logger.info(i+ " " + Arrays.toString(ints));
        }
        logger.info("bubbleSorter finish: " + Arrays.toString(ints));
        }
    }

