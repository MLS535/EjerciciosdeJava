package data;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el peso con comas: ");
        double peso=scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce la altura con comas como por ejemplo 1,65: ");
        double altura= scanner1.nextDouble();
        double calculoIms= peso/Math.pow(altura,2);

        if (calculoIms<16){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || < 16 | Criterio de ingreso en hospital |");
        }if (calculoIms>=16 && calculoIms<=17){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || de 16 a 17 | Infrapeso |");
        }if (calculoIms>=17 && calculoIms<=18){
            System.out.println("Valor de IMC "+calculoIms +" | Diagnóstico || de 17 a 18 | Bajo peso |");
        }if (calculoIms>=18 && calculoIms<=25){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || de 18 a 25 | Peso normal (saludable) |");
        }if (calculoIms>=25 && calculoIms<=30){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || de 25 a 30 | Sobrepeso |");
        }if (calculoIms>=30 && calculoIms<=35){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || de 30 a 35 | Sobrepeso crónico |");
        }if (calculoIms>=35 && calculoIms<=40){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || de 35 a 40 | Obesidad premorbida |");
        }else if (calculoIms>40){
            System.out.println("Valor de IMC "+calculoIms +"| Diagnóstico || > 40 | Obesidad morbida |");
        }
    }
}
