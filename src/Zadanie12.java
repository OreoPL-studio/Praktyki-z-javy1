import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj ilosc ciasteczek w pudełku: ");
        int iloscCiasteczek = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj ilosc zjedzonych ciasteczek: ");
        int iloscZjedzonychCiasteczek = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj ilosc porcji: ");
        int iloscPorcji = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj ilosc kalorii na porcję: ");
        int iloscKaloriiNaPorcje = keyboard.nextInt();
        keyboard.nextLine();

        int iloscKalorii = (iloscZjedzonychCiasteczek / iloscPorcji) * iloscKaloriiNaPorcje;
        System.out.println("Ilość skonsumowanych kalorii: " + iloscKalorii);
    }
}
