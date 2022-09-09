public class Zadania {
    public static void main(String[] args) {
        int pomieszczenie1 = 3 * 4;
        int pomieszczenie2 = 3 * 4;
        int pomieszczenie3 = 2 * 3;
        int pomieszczenie4 = 2 * 2;
        int powierzchnia = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        int osoba = 4;
        System.out.println("Pomieszczenie nr 1: " + pomieszczenie1);
        System.out.println("Pomieszczenie nr 2: " + pomieszczenie2);
        System.out.println("Pomieszczenie nr 3: " + pomieszczenie3);
        System.out.println("Pomieszczenie nr 4: " + pomieszczenie4);
        System.out.println("Powierzchnia wynosi: " + powierzchnia);

        double powierzchniaNaOsobe = (double)powierzchnia / osoba;
        System.out.println("Powierzchnia na osobę wynosi: " + powierzchniaNaOsobe);
    }
}
