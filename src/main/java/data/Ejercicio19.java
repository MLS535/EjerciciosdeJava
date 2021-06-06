package data;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] v1, v2, v3;

        v1 = new int[15];
        // Inicializar el array de números
        for (int i = 0; i < v1.length; i++) {
            v1[i] = (int) (10 * Math.random() + 1);
        }

        v2 = new int[7];
        // Inicializar el array de números
        for (int i = 0; i < v2.length; i++) {
            v2[i] = (int) (10 * Math.random() + 1);
        }

        if (v1.length > v2.length) {
            v3 = new int[v1.length];
            // Sumar los dos arrays
            for (int i = 0; i < v2.length; i++) {
                v3[i] = v1[i] + v2[i];
            }

            // Añadir los elementos restantes
            for (int i = v2.length; i < v3.length; i++) {
                v3[i] = v1[i];
            }
        } else {
            v3 = new int[v2.length];
            // Sumar los dos arrays
            for (int i = 0; i < v1.length; i++) {
                v3[i] = v1[i] + v2[i];
            }

            // Añadir los elementos restantes
            for (int i = v1.length; i < v3.length; i++) {
                v3[i] = v2[i];
            }
        }

        // Imprimir el array resultante
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}
