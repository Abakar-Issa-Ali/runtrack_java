import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LargeSumWithThreads {

    private static final int MAX_NUMBER = 10_000_000;
    private static final int NUM_THREADS = 10; // Nombre de threads à utiliser

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        long sum = 0;

        int chunkSize = MAX_NUMBER / NUM_THREADS;
        SumTask[] tasks = new SumTask[NUM_THREADS];

        // Création des tâches de somme
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * chunkSize + 1;
            int end = (i + 1) * chunkSize;
            tasks[i] = new SumTask(start, end);
            executor.submit(tasks[i]);
        }

        // Arrêter l'executor après la soumission des tâches
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Calcul de la somme totale
        for (SumTask task : tasks) {
            sum += task.getSum();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale des nombres de 1 à " + MAX_NUMBER + " est : " + sum);
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }
}

// Classe pour la tâche de somme
class SumTask implements Runnable {
    private int start;
    private int end;
    private long sum;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
