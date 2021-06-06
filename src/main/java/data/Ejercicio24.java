package data;

public class Ejercicio24 {
    public static void main(String[] args) {
        final String nif="432186044";
        System.out.println(validar(nif));
    }
    private static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static boolean validar(String dni) {
        return comprobarFormato(dni) && comprobarLetra(dni);
    }
    private static boolean comprobarFormato(String dni) {
        boolean valido = true;

        valido = (dni.length() == 9);

        if(valido) {
            char c = dni.charAt(dni.length()-1);
            valido = Character.isLetter(c);
        }

        if(valido) {
            int i = 0;
            while(valido && i<dni.length()-2) {
                char n = dni.charAt(i);
                valido = Character.isDigit(n);
                i++;
            }
        }

        return valido;
    }
    private static boolean comprobarLetra(String dni) {
        char letra = dni.charAt(dni.length()-1);
        int num = Integer.valueOf(dni.substring(0, dni.length()-1));

        return NIF_STRING_ASOCIATION.charAt(num % 23) == letra;
    }
}
