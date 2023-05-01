package sem3dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void main(String[] args) {
        Integer[] inputArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> inputList = new ArrayList<>();
        inputList.addAll(Arrays.asList(inputArray));
        System.out.println("inputList:\t"+inputList);
        Iterator<Integer> iterator = inputList.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next%2==0){
                iterator.remove();
            }
        }
        System.out.println("outputList:\t"+ inputList);
    }
}
