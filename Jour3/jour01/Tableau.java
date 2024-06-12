public class Tableau{
    public static void main(String[] args) {
        int[] tableau = new int[5];

        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        System.out.print("Tableau: ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
            
        }
        System.out.println();

        System.out.println("Valeur à l'index 0: " + tableau[0]);
        System.out.println("Valeur à l'index 2: " + tableau[2]);
        System.out.println("Valeur à l'index 4: " + tableau[4]);
    }
}