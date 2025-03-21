package chapter3;

import java.util.ArrayList;
import java.util.Random;

public class RandomRemover {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Random random = new Random();

        while(!list.isEmpty()) {
            int index = random.nextInt(list.size());
            System.out.println("Removing element at index " + index + ": " + list.remove(index));
        }
    }
}
