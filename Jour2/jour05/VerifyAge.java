import java.util.Scanner;

public class VerifyAge {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer votre âge : ");
        int age = scanner.nextInt();

        scanner.close();

        if (age < 16) {
            System.out.println("Vous ne pouvez pas travailler.");
        } else if (age > 55) {
            if (age == 67) {
                System.out.println("Vous êtes à la retraite.");
            } else {
                System.out.println("Il peut être difficile de trouver un emploi.");
            }
        } else {
            System.out.println("Vous pouvez travailler.");
        }
    }
}
