import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        // Début du chronométrage
        long startTime = System.currentTimeMillis();

        int length;
        try ( // Scanner pour lire la longueur de la chaîne de l'utilisateur
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
            length = scanner.nextInt();
        }

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Créer deux threads pour écrire les deux moitiés dans le fichier "output.txt"
        Thread firstHalfThread = new Thread(new FileWriteTask("output.txt", randomString.substring(0, length / 2), false));
        Thread secondHalfThread = new Thread(new FileWriteTask("output.txt", randomString.substring(length / 2), true));

        // Démarrer les threads
        firstHalfThread.start();
        secondHalfThread.start();

        // Attendre que les threads se terminent
        try {
            firstHalfThread.join();
            secondHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Fin du chronométrage
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Afficher le temps d'exécution
        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }

    // Méthode pour générer une chaîne de caractères aléatoire
    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(randomIndex));
        }

        return stringBuilder.toString();
    }
}

class FileWriteTask implements Runnable {
    private String fileName;
    private String content;
    private boolean append;

    public FileWriteTask(String fileName, String content, boolean append) {
        this.fileName = fileName;
        this.content = content;
        this.append = append;
    }

    @Override
    public void run() {
        try (FileWriter fileWriter = new FileWriter(fileName, append)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
