package data;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int n=scanner2.nextInt();

        Scanner scanner3= new Scanner(System.in);
        System.out.println("Introduce un segundo valor: ");
        int m=scanner3.nextInt();
        int x= m;
        for (int i = 1; i <n ; i++) {
            m=m*x;
            System.out.println(m);
        }
    }
}
