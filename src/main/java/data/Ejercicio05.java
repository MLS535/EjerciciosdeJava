package data;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int num1=scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce un segundo valor: ");
        int num2= scanner1.nextInt();

        if (num1>num2){
            System.out.println(num1+ " es mayor a " +num2);
        }else if (num1<num2){
            System.out.println(num1 +" es menor a " + num2);
        }else if (num1==num2){
            System.out.println(num1+ " es igual a " + num2);
        }
        }
    }
