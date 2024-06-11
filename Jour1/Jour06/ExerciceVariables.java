public class ExerciceVariables {
    public static void main(String[] args) {
        // Déclaration et initialisation des variables num1 et num2
        int num1 = 5;
        int num2 = 10;
    
        System.out.println("La valeur de num1 est " + num1 + " et " + "la valeur de num2 est " + num2);
        
        // Échange des valeurs entre num1 et num2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Affichage des nouvelles valeurs de num1 et num2 après échange
        System.out.println("La valeur de num1 est " + num1 + " et " + "la valeur de num2 est " + num2);
       
    }
}
