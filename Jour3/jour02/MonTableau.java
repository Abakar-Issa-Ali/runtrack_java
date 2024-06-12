public class MonTableau{
    public static void main(String[] args) {
        
        int[] monTableau = {12, 6, 76, 89};

        System.out.print("Les valeurs initiales du tableau : ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println();

        monTableau[0] = 25;
        monTableau[1] = 15;
        monTableau[2] = 30;
        monTableau[3] = 67;

        System.out.print("Nouvelles valeurs du tableau : ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");

    }
    System.out.println();
}

}