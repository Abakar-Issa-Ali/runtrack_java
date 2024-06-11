import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un nombre : ");
        int numero = scanner.nextInt();
        scanner.close();

        // Conversion du nombre en chaîne de caractères pour compter les chiffres
        String numeroStr = Integer.toString(numero);
        
        // Comptage du nombre de chiffres
        int nombreChiffres = numeroStr.length();

        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreChiffres);
    }
}
