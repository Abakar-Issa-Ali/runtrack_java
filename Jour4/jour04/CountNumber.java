import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {
        // Début du chronométrage
        long startTime = System.currentTimeMillis();
        int maxNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez le nombre maximum à compter : ");
            maxNumber = scanner.nextInt();
        }

        for (int i = 1; i <= maxNumber; i++){
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("Le programme a compté jusqu'à " + maxNumber);
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }
}
