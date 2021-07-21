package arrays;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 3, 1};

        Arrays.sort (a);
        System.out.println (Arrays.toString (a));

        Arrays.fill (a, 8);
        System.out.println (Arrays.toString (a));

        int[] b = Arrays.copyOf (a, 4);
        System.out.println (Arrays.toString (b));

        if (Arrays.equals (a, b)){
            System.out.println ("Arrays A e B são iguais.");
        } else {
            System.out.println ("Arrays A e B não são iguas.");
        }
    }
}
