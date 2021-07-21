package arrays;

import java.util.Arrays;

public class ArraySetAll {
    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.setAll(a, x -> x);
        System.out.println (Arrays.toString (a));

        String[] valores = {"1", "2", "3", "4", "5"};
        int[] b = new int[valores.length];
        System.out.println (Arrays.toString (valores));

        Arrays.setAll (b,x -> Integer.parseInt (valores[x]));
        System.out.println (Arrays.toString (b));
    }
}
