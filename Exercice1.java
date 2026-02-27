import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double n1 = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Le plus grand nombre est : " + n1);
        } else if (n2 > n1) {
            System.out.println("Le plus grand nombre est : " + n2);
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

        sc.close();
    }
}
