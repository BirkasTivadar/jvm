package jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorter {

    public List<Integer> createListAndSort(int size) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt());
        }
        Collections.sort(numbers);
        return numbers;
    }
}
