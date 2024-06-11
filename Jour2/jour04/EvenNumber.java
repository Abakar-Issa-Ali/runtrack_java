public class EvenNumber {
    public static void main(String[] args) {
        // Affichage des chiffres pairs de 0 à 100
        System.out.println("Les chiffres pairs de 0 à 100 sont :");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) { 
                System.out.println(i);
            }
        }
    }
}
