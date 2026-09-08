package tuf_java;

import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        int i;
        for (i = 1; i < 10; i++) {
            System.out.println("sonam");
        }

        // print sum of elements in an array
        int size = ab.nextInt();
        int[] arr = new int[size];

        for (i = 0; i < size; i++) {
            arr[i] = ab.nextInt();
        }

        int sum = 0;
        for (i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
        ab.close();
    }
}