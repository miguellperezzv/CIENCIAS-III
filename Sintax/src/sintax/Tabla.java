package sintax;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tabla {

    String[] caracteres = {"SELECT", "*", "FROM", "variable", ",", ";", "INSERT", "INTO", "VALUES", "(", ")", "DELETE", "WHERE", "="};
    

    int matriz[][] = {
        {0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    boolean analizar(String[] parts) {
        boolean validez = true;
        for (int i = 0; i < parts.length; i++) {

            if (i < parts.length-1) {
                if (matriz[this.getIndex(parts[i])][this.getIndex(parts[i + 1])] == 0) {
                    validez = false;
                }
            }

        }
        return validez;
    }

    private int getIndex(String part) {
        int index = -1;
        for (int i = 0; i < caracteres.length; i++) {

            if (caracteres[i].equalsIgnoreCase(part)) {
                index = i;
            }
        }
        if (index == -1) {
            index = 3;  //VARIABLE
        }

        return index;
    }

}
