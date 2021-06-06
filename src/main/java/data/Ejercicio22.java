package data;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int x=scanner.nextInt();
        System.out.println("El numero introducido "+x +" " + esPrimo(x));
    }

    public static boolean esPrimo(int n) {
        int cont = 2;
        boolean primo = true;

        while ((primo) && (cont != n)) {
            if (n % cont == 0)
                primo = false;
            cont++;
        }

        return primo;
    }
}
