import java.util.ArrayList;
import java.util.List;

public class UniqueValue {
    public static void main(String[] args) {

        int[] tableau = {3, 7, 3, 9, 8, 7, 2, 8};

     
        List<Integer> valeursUniques = new ArrayList<>();     // Liste pour stocker les valeurs uniques

        for (int i = 0; i < tableau.length; i++) {
            boolean estUnique = true;
            for (int j = 0; j < i; j++) {
                if (tableau[i] == tableau[j]) {
                    estUnique = false;
                    break;
                }
            }
            if (estUnique) {
                valeursUniques.add(tableau[i]);
            }
        }

        System.out.println("Valeurs uniques du tableau :");
        for (int valeur : valeursUniques) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
}
