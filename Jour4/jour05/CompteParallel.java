import java.util.Scanner;

public class CompteParallel {

    public static void main(String[] args) {
    
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        int midPoint = maxNumber / 2;    // Calcul des plages de nombres

        CountingThread firstHalfThread = new CountingThread(1, midPoint);      // Création des threads
        CountingThread secondHalfThread = new CountingThread(midPoint + 1, maxNumber);
     
        firstHalfThread.start();      // Démarrage des threads
        secondHalfThread.start();

        try {
            firstHalfThread.join();
            secondHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalCount = firstHalfThread.getCount() + secondHalfThread.getCount();   // Calcul du compte total

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le programme a compté jusqu'à " + maxNumber);
        System.out.println("Le compte total est : " + totalCount);
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }
}

class CountingThread extends Thread {    // Classe pour le thread de comptage
    private int start;
    private int end;
    private int count;

    public CountingThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
