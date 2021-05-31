package data;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        double factorial = 1;
// El número elegido para el factorial es el 30
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        double numero=scanner.nextDouble();
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println(factorial);
    }
}
