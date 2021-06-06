package data;

public class Ejercicio18 {
    public static void main(String[] args) {
        int[] vector1, vector2, union;

        vector1 = new int[10];
        vector2 = new int[10];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (10 * Math.random() + 1);
            vector2[i] = (int) (10 * Math.random() + 1);
        }


        union = new int[vector1.length + vector2.length];
        for (int i = 0; i < vector1.length; i++) {
            union[i] = vector1[i];
            union[vector1.length + i] = vector2[i];
        }
        for (int i = 0; i < union.length; i++) {
            System.out.println(union[i] + " ");
        }

    }
}


