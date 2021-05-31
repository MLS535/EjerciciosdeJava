package data;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String str=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
