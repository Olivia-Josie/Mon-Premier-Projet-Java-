import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //ici on cree l'objet Scanner

        System.out.println("Entrez le premiewr nombre :");
        double a = input.nextDouble();
        System.out.println("Entrez le deuxieme nombre :");
        double b =input.nextDouble();
        System.out.println("Choisissez une operation(+,-,*,/):");
        char operateur =input.next().charAt(0);
        double resultat = 0 ;
        boolean operationValide = true ;
        switch (operateur) {
            case '+':
                resultat = a +b;
                break;
                case '-':
                resultat = a-b ;
                break;
                case '*':
                resultat =a*b;
                break;
                case '/':
                if(b !=0){
                resultat = a/b;
                }else{
                    System.out.println("Erreur : Division par zero !");
                    operationValide = false;
                }
                break;
        
            default:
            System.out.println("operateur invalide !");
            operationValide = false;
        
        }
        if(operationValide){
            System.out.println("Resultat : " +resultat);
        }
    }
}
