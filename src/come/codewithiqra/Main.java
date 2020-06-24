package come.codewithiqra;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int my_array[] = {33, 22, 43, 54, 6, 77, 86, 65, 23, 44, 77, 33, 12, 23, 34, 56, 78};
        int new_array[] = new int[17];

        System.out.println("Original Array: " + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length - 1; i++) {
            new_array[i] = my_array[i];
        }

        System.out.println("New Array: "+ Arrays.toString(new_array));
    }
}