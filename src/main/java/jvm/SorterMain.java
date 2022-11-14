package jvm;

import java.util.List;
import java.util.Random;

public class SorterMain {

    public static void main(String[] args) {
        while (true) {
            Random random = new Random();
            int size = random.nextInt(100000);
            System.out.println(String.format("Creating and sorting list with size: %d", size));
            List<Integer> numbers = new Sorter().createListAndSort(size);
        }
    }
}
