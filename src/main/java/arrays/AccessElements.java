package arrays;


import java.util.Arrays;

public class AccessElements {
    public static void main(String[] args) {
        String[] names = {"Maria", "Carlos", "João", "Alisson"};

        System.out.println (names[0]);
        System.out.println (names[3]);

        int[] valores = {1, 2, 3};
        valores[0] *=2;
        valores[1] *=2;
        valores[2] *=2;

        System.out.println (Arrays.toString (valores));

    }
}
