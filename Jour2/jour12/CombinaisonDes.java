public class CombinaisonDes {
    public static void main(String[] args) {

        int faces = 6;    // Nombre de faces du dé

        int nombreTotalCombinaisons = 0;

        // Parcourir toutes les combinaisons possibles des trois dés
        for (int d1 = 1; d1 <= faces; d1++) {
            for (int d2 = 1; d2 <= faces; d2++) {
                for (int d3 = 1; d3 <= faces; d3++) {

                    System.out.println(d1 + " " + d2 + " " + d3);   // Affichage de chaque combinaison
                    nombreTotalCombinaisons++;
                }
            }
        }

        System.out.println("Nombre total de combinaisons : " + nombreTotalCombinaisons);
    }
}
