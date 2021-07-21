package arrays;

import java.util.Arrays;

public class ArraysSearch {
    //Arrays.binarySearch requer uma matriz organizada ".sort"
    public static void main(String[] args) {
        String[] planets = {"Mercurio", "Venus", "Marte", "Terra", "Jupiter",
        "Saturno", "Urano", "Netuno", "Plutão"};

        Arrays.sort (planets);
        System.out.println (Arrays.toString (planets));

        String planet = "Jupiter";
        int r = Arrays.binarySearch (planets, planet);
        String msg;

        if (r >= 0){
            msg = String.format ("%s está na posição %d da " +
                    "matriz organizada em ordem alfabética.", planet, r );
        } else {
            msg = planet + " não encontrado.";
        }
        System.out.println (msg);
    }
}
