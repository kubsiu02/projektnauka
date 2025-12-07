import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int x  = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int y  = scanner.nextInt();

        int z = x + y;

        System.out.println("-----------------------------");
        System.out.println("Wynik dzialania: " + x + " + " + y + " = " + z);
    }
}
