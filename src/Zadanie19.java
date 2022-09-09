import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj ilość ciasteczek: ");
        int ciasteczka = keyboard.nextInt();
        double cukier = (double)ciasteczka * 0.03125;
        double maslo = (double)ciasteczka * 0.02083;
        double maka = (double)ciasteczka * 0.0572917;
        System.out.println(cukier + " " + maslo + " " + maka);
    }
}
