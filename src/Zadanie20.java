import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj kwotę pierwotnie zdeponowaną na koncie: ");
        double P = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj roczną stopę procentową: ");
        double r = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj ile razy w roku odsetki są doliczane do kapitału: ");
        double n = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj ilość lat: ");
        double t = keyboard.nextDouble();
        keyboard.nextLine();

        double A = P * Math.pow(1 + (r/100) / n, n*t);
        System.out.println("Stan konta po " + t + " lat: " + A);
    }
}
