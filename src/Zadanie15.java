import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę ulubionego miasta: ");
        String miasto = keyboard.nextLine();

        int dlugosc = miasto.length();
        System.out.println(dlugosc);

        String big, small;
        big = miasto.toUpperCase();
        small = miasto.toLowerCase();
        System.out.println(big + " " + small);

        char pierwszaLitera = miasto.charAt(0);
        System.out.println(pierwszaLitera);
    }
}
