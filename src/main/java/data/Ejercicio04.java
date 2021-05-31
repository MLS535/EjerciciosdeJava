package data;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el peso con comas: ");
        double peso=scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce la altura con comas como por ejemplo 1,65: ");
        double altura= scanner1.nextDouble();
        double calculoIms= peso/Math.pow(altura,2);

        System.out.println("El indice de masa corporal de está persona es de "+calculoIms);
    }
}
