import java.util.Scanner;

public class OperatoryPorównania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę do porównania");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę do porównania");
        int secondNumber = scanner.nextInt();

        //int firstNumber = 4;
        //int secondNumber = 6;
        //sprawdzamy czy 6 jest większe od 4
        boolean result = secondNumber > firstNumber;

        System.out.println(result);               //Umieszczamy w nawiasie!
        System.out.println("pierwsza > druga " + (firstNumber>secondNumber));
        System.out.println(firstNumber<secondNumber);
        System.out.println(firstNumber>=secondNumber);
        System.out.println(firstNumber<=secondNumber);
        System.out.println(firstNumber==secondNumber);
        System.out.println(firstNumber!=secondNumber);
    }
}
