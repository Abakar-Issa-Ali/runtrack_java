import java.util.Scanner;

public class SommeParallel {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int size;
        int[] numbers;
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez la taille du tableau de nombres : ");
            size = scanner.nextInt();
           
            numbers = new int[size];    // Création du tableau
            System.out.println("Entrez les nombres du tableau : ");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
        }
        int midPoint = size / 2;     // Calcul du point médian pour diviser le tableau en deux 

        SumThread firstHalfThread = new SumThread(numbers, 0, midPoint);
        SumThread secondHalfThread = new SumThread(numbers, midPoint, size);

        firstHalfThread.start();
        secondHalfThread.start();

        try {
            firstHalfThread.join();
            secondHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalSum = firstHalfThread.getSum() + secondHalfThread.getSum();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale des nombres dans le tableau est : " + totalSum);
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }
}
class SumThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
