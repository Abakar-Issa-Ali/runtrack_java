public class Matrice {
    public static void main(String[] args) {

        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        System.out.println("Valeurs de matrice1 :");
        for (int[] matrice : matrice1) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[j] + " ");
            }
            System.out.println();
        }
        
        int[][] resultat = new int[3][3];
        
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }
        
        System.out.println("Résultat de l'addition de matrice1 et matrice2 :");
        for (int[] resultat1 : resultat) {
            for (int j = 0; j < resultat1.length; j++) {
                System.out.print(resultat1[j] + " ");
            }
            System.out.println();
        }
    }
}
