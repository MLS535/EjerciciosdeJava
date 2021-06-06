package data;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int x=scanner.nextInt();
        grados(x);
    }
    public static void grados(double celsius){
        for (int f = 0; f <= 300; f+=20) {
            celsius = (5.0/9.0)*(f - 32);
            System.out.println(f + "º Fahrenheit = " + celsius + "º celsius");
        }
    }
}
