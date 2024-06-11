import java.util.Scanner;

public class Somme {

    public static int calculerSomme(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Veuillez entrer le deuxième nombre : ");
        int nombre2 = scanner.nextInt();
        scanner.close();

        int resultat = calculerSomme(nombre1, nombre2);
        
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + resultat);
    }
}
