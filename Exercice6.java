public class Exercice6 {
    public static void main(String[] args) {

        double note1 = 12;
        double note2 = 9;
        double note3 = 14;

        double moyenne = (note1 + note2 + note3) / 3;

        System.out.println("La moyenne est : " + moyenne);

        if (moyenne >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("Ajourné");
        }
    }
}
