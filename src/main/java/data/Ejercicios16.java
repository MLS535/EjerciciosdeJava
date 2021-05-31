package data;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios16 {
    public static void main(String[] args) {
        /*
        Construir un programa que pida al usuario una serie de números enteros,
        los almacene en un array, y obtenga el máximo y el mínimo de los valores
        almacenados.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el numero que quieres introducir: ");
        int numero=scanner.nextInt();
    int i = 0;
        int array;

        for (i = 0; i < numero; i++) {
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Introduce el numero que quieres introducir: ");
            int numero1=scanner1.nextInt();


            System.out.println(array);
           // Arrays.stream(array).min();
        }
    }


}
