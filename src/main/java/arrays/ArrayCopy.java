package arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] valores2 = Arrays.copyOf (valores, 6);
        int[] valores3 = Arrays.copyOfRange (valores, 2, 7);
        //precisa criar um array vazio
        int[] valores4 = new int[8];
        System.arraycopy (valores, 0, valores4, 0, valores.length);

        System.out.println (Arrays.toString (valores));
        System.out.println (Arrays.toString (valores2));
        System.out.println (Arrays.toString (valores3));
        System.out.println (Arrays.toString (valores4));
    }
}
