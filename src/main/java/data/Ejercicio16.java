package data;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Construir un programa que pida al usuario una serie de números enteros,
        los almacene en un array, y obtenga el máximo y el mínimo de los valores
        almacenados.
         */

        
        int max,min;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num [i]= (int) (100*Math.random()+1);
        }
        max=Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max =num[i];
            }
        }
        System.out.println("El maximo es: "+ max);

        min=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] <min){
                min=num[i];
            }
        }
        System.out.println("El minimo es "+ min);

    }
}
