package data;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
    Construir un programa que simule el juego de la adivinanza de un número. El
    ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene
    cinco oportunidades para acertarlo. Después de cada intento el programa debe
    indicarle al usuario si el número introducido por él es mayor, menor o igual al
    número a adivinar, y el número de intentos restantes.
         */
        int numero;
       int a;
        int i=0;
        do {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Introduce el numero: ");
            numero=scanner.nextInt();
            a = (int) (1 + (Math.random() * 100));
            System.out.println("El numero que se sortea es "+a);
            i++;
        }while (numero==a || i<5);
        System.out.println("Enhorabuena has ganado");



    }
}
