package data;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Inicializar la agenda
        String[][] agenda = new String[7][24];

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                agenda[i][j] = "No tengo planes.";
            }
        }

        // Añadir eventos a la agenda
        agenda[0][9] = "Curso de JAVA";
        agenda[0][15] = "Curso de HTML5";
        agenda[1][9] = "Curso de JAVA";
        agenda[1][15] = "Curso de CSS3";
        agenda[2][2] = "Curso de CSS3";

        // Mostrar la agenda
        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.print(agenda[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
