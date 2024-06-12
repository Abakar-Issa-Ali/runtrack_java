public class NombreOccurrence{
    public static void main(String[] args) {

        int[] tableau = {3, 7, 3, 9, 8};
        
        boolean[] dejaCompte = new boolean[tableau.length];           // Tableau pour stocker les valeurs déjà comptées

        
        System.out.println("Nombre d'occurrences de chaque nombre :");
        for (int i = 0; i < tableau.length; i++) {
            if (!dejaCompte[i]) {
                int count = 1;
                for (int j = i + 1; j < tableau.length; j++) {
                    if (tableau[i] == tableau[j]) {
                        count++;
                        dejaCompte[j] = true;
                    }
                }
                System.out.println("Nombre " + tableau[i] + " : " + count + " occurrence(s)");
            }
        }
    }
}
