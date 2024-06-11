import java.util.Scanner;

public class EchangerCaractere {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez entrer la première chaîne de caractères : ");
        String chaine1 = scanner.nextLine();
        
        System.out.print("Veuillez entrer la deuxième chaîne de caractères : ");
        String chaine2 = scanner.nextLine();
        
        scanner.close();
        
        System.out.println("Avant l'échange :");
        System.out.println("Chaine1 : " + chaine1);
        System.out.println("Chaine2 : " + chaine2);
        
        // Échange des valeurs sans variable temporaire
        chaine1 = chaine1 + chaine2;      
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // Extrait l'ancienne valeur de chaine1
        chaine1 = chaine1.substring(chaine2.length()); // Extrait l'ancienne valeur de chaine2

        System.out.println("Après l'échange :");
        System.out.println("Chaine1 : " + chaine1);
        System.out.println("Chaine2 : " + chaine2);
    }
}
