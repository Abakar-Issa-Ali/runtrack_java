import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();
        scanner.close();

        for (int ligne = 1; ligne <= hauteur; ligne++) {
            // Boucle pour imprimer les étoiles
            for (int colonne = 1; colonne <= ligne; colonne++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
