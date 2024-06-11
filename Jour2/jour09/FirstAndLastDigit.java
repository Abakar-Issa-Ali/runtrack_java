public class FirstAndLastDigit{
    public static void main(String[] args) {
        int nombre = 1234;

        // Récupération du premier chiffre
        int firstDigit = nombre;
        while (firstDigit  >= 10) {
            firstDigit  /= 10;
        }
        // Récupération du dernier chiffre
        int lastDigit = nombre % 10;

        System.out.println("Le premier chiffre de " + nombre + " est : " + firstDigit );
        System.out.println("Le dernier chiffre de " + nombre + " est : " + lastDigit);
    }
}
