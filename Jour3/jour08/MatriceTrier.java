import java.util.Arrays;

public class MatriceTrier {
    public static void main(String[] args) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        System.out.println("Matrice initiale :");
        afficherMatrice(tableau);

        int[] elements = new int[tableau.length * tableau[0].length];
        int index = 0;
        for (int[] tableau1 : tableau) {
            for (int j = 0; j < tableau1.length; j++) {
                elements[index++] = tableau1[j];
            }
        }
        Arrays.sort(elements);

        index = 0;
        for (int[] tableau1 : tableau) {
            for (int j = 0; j < tableau1.length; j++) {
                tableau1[j] = elements[index++];
            }
        }

        System.out.println("Matrice triée :");
        afficherMatrice(tableau);
    }

    public static void afficherMatrice(int[][] matrice) {
        for (int[] matrice1 : matrice) {
            for (int j = 0; j < matrice1.length; j++) {
                System.out.print(matrice1[j] + " ");
            }
            System.out.println();
        }
    }
}
