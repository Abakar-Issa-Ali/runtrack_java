import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        int length;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
            length = scanner.nextInt();
        }

        String randomString = generateRandomString(length);
        
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            fileWriter.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le programme a pris " + executionTime + " millisecondes pour s'exécuter.");
    }

    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstvwyxz";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(randomIndex));
        }

        return stringBuilder.toString();
    }
}
