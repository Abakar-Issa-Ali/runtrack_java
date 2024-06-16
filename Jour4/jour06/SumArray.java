import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
    
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau de nombres : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];  // Création du tableau

        System.out.println("Entrez les nombres du tableau : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale des nombres dans le tableau est : " + sum);
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }
}
