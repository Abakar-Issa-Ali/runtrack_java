
import java.util.Scanner;

public class NomPrenom{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine();
        
        System.out.println("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();

        scanner.close();


        System.out.println("Votre nom et prénom sont " + nom  + " " + prenom);


    }
}