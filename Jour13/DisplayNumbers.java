import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        
        int nombre;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Veuillez entrer un nombre entier : ");
            nombre = scanner.nextInt();
        }
        
        for (int i = 1; i <= nombre; i++) {
            System.out.print(i);
            if (i < nombre) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Pour une nouvelle ligne après l'affichage
    }
}
