public class SumDigit{
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;

        while (nombre > 0) {
            somme += nombre % 10;   // Ajoute le dernier chiffre à la somme
            nombre /= 10;    // Supprime le dernier chiffre du nombre
        }

        System.out.println("La somme des chiffres est : " + somme);
    }
}
