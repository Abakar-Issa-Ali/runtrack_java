import java.util.Scanner;

public class CalculFactorielle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Veuillez entrer un nombre entier positif : ");
        int nombre = scanner.nextInt();
        scanner.close();

        if (nombre < 0) {
            System.out.println("La factorielle n'est définie que pour les nombres positifs.");
        } else {
            // Calcul de la factorielle
            long factorielle = 1;
            for (int i = 1; i <= nombre; i++) {
                factorielle *= i;
            }

            System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);
        }
    }
}
