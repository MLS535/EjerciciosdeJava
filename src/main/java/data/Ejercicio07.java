package data;

import java.util.Scanner;

public class Ejercicio07 {
    public static int valor1(){
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int num1=scanner1.nextInt();
        return num1;
    }

    public static int valor2(){
        Scanner scanner2= new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int num2=scanner2.nextInt();
        return num2;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Bienvenido a la retro Calculadora! Selecciona la operación que deseas realizar: ");
        System.out.println("1.Escribe sumar/S/s si quieres sumar");
        System.out.println("2.Escribe restar/R/r si quieres restar");
        System.out.println("3.Escribe producto/P/p/M/m si quieres producto");
        System.out.println("4.Escribe division/d/D si quieres division");
        System.out.println("Introduce el valor que deseas hacer");
        String r2=scanner.nextLine();

        if (r2.equals("sumar") || r2.equals("S") || r2.equals("s")){

            int totalSuma=valor1()+valor2();
            System.out.println(totalSuma);
        }if (r2.equals("restar")|| r2.equals("R")|| r2.equals("r")){
            int totalResta=valor1()-valor2();
            System.out.println(totalResta);
        }if (r2.equals("producto")|| r2.equals("P")|| r2.equals("p")|| r2.equals("M")|| r2.equals("m")){
            int totalProducto=valor1()%valor2();
            System.out.println(totalProducto);
        }if (r2.equals("division")|| r2.equals("D")|| r2.equals("d")){
            int totalDivision=valor1()/valor2();
            System.out.println(totalDivision);
        }
    }
}
