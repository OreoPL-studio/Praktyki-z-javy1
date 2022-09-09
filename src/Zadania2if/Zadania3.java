package Zadania2if;
import java.util.Scanner;

public class Zadania3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wagę: ");
        int waga = keyboard.nextInt();

        System.out.println("Podaj wzrost");
        double wzrost = keyboard.nextDouble();

        double BMI = waga/Math.pow(wzrost,2);
        System.out.println(BMI);
        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("Optymalnie");
        }else if(BMI < 18.5){
            System.out.println("Niedowaga");
        }else if(BMI > 25) {
            System.out.println("Nadwaga");
        }
    }
}
