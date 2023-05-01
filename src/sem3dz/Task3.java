package sem3dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> inputList = new ArrayList<>(Arrays.asList(inputArray));
        System.out.println("inputList:\t" + inputList);
        Integer min = inputList.get(0);
        Integer max = inputList.get(0);
        int sum = 0;
        for (Integer integer : inputList) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
            sum += integer;
        }
        System.out.printf("min:\t%d\nmax:\t%d\navg:\t%f", min, max, (double) sum / inputList.size());
    }
}