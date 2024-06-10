public class Facture{
    public static void main(String[] args) {
        // Déclaration des variables
        double prix = 49.99;
        int quantite = 3;
        double tarifHT = prix * quantite;
        double tva = 0.20;
        double montantTaxe = tarifHT * tva;
        double tarifTTC = tarifHT + montantTaxe;

      
        System.out.println("Le montant total est : " + tarifHT );
        System.out.println("Le montant de la taxe est : " + montantTaxe);
        System.out.println("Le montant total à payer est : " + tarifTTC );
    }
}