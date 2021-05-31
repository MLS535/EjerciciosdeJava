package data;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un valor con comas: ");
        double r2=scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce un segundo valor con comas: ");
        double r3= scanner1.nextDouble();

        double volumen=(4/3)*Math.PI*r3;
        double superficie= 4*Math.PI*r2;
        System.out.println("El volumen de la esfera es el siguiente: "+volumen);
        System.out.println("La superficie de la esfera es el siguiente " + superficie);
    }
}
