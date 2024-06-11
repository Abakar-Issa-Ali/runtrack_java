import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un chiffre : ");
        int nombre = scanner.nextInt();

        scanner.close();

        System.out.println("Table de multiplication de " + nombre + " :");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + nombre + " = " + (i * nombre));
        }
    }
}
