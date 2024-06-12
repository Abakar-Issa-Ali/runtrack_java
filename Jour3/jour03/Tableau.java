public class Tableau{
    public static void main(String[] args) {
        
        String[] noms = {"Josette", "John","Myrtille","Marc"};

        System.out.println("Valeur à l'index 1 :  " + noms[1]);

        noms[2] = "Mireille";




        System.out.print("Valeurs du tableau : ");
        for (String nom : noms) {
            System.out.print(nom + " ");
        }
        System.out.println();

    }
}