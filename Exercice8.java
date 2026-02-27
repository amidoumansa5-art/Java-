import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double n1 = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double n2 = sc.nextDouble();

        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = sc.next().charAt(0);

        double resultat;

        switch (operation) {
            case '+':
                resultat = n1 + n2;
                System.out.println("Résultat : " + resultat);
                break;

            case '-':
                resultat = n1 - n2;
                System.out.println("Résultat : " + resultat);
                break;

            case '*':
                resultat = n1 * n2;
                System.out.println("Résultat : " + resultat);
                break;

            case '/':
                if (n2 != 0) {
                    resultat = n1 / n2;
                    System.out.println("Résultat : " + resultat);
                } else {
                    System.out.println("Division par zéro impossible !");
                }
                break;

            default:
                System.out.println("Opération invalide !");
        }

        sc.close();
    }
}
