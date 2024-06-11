import java.util.Scanner;

public class ConvertMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez une durée en minutes : ");  // Demande de la durée en minutes
        int minutes = scanner.nextInt();
        scanner.close();
        
        // Conversion des minutes en heures et minutes
        int heures = minutes / 60;
        int resteMinutes = minutes % 60;
        
        System.out.println(minutes + " minutes est équivalent à " + heures + " heures et " + resteMinutes + " minutes.");
    }
}
