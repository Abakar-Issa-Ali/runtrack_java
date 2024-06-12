import java.util.Random;

public class TabUnidimentionnel {
    public static void main(String[] args) {

        int[] tableau = new int[10];
        
        Random random = new Random();
        
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); 
        }
        System.out.println("Tableau de nombres entiers aléatoires :");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println(); 
    }
}
