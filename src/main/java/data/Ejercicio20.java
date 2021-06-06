package data;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int x=scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int y=scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int z= scanner2.nextInt();
        System.out.println("El máximo de "+ maximo(x,y));
        System.out.println("El maximo de estos 3 valores es "+ maxim2(x,y,z));
    }


    public static int maximo(int x, int y){
        return Math.max(x, y);
    }
    public static int maxim2(int x, int y, int z){
        return maximo(maximo(x, y), z);
    }
}
