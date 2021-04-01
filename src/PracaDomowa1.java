import java.util.Scanner;

public class PracaDomowa1 {
    public static void main(String[] args) {
            //PROSIMY UŻYTKOWNIKA O DWIE LICZBY DO DZIAŁAŃ
            Scanner scanner = new Scanner(System.in);
            System.out.println("Prosze podaj pierwszą liczbę");
            int firstNumber = scanner.nextInt();
            System.out.println("Prosze podaj drugą liczbę");
            int secondNumber = scanner.nextInt();

            //OKREŚLAMY DZIAŁANIA DO POSZCZEGÓLNYCH KLAS
            int addition = firstNumber + secondNumber;
            int subtraction = firstNumber - secondNumber;
            int multiplication = firstNumber * secondNumber;
            float division = firstNumber/secondNumber;
            //WARTOŚĆ DZIELENIA NIE POKAZUJE RESZTY PO PRZECINKU
            int mod = secondNumber%firstNumber;

            //WYWOŁUJEMY POKAZANIE DZIAŁAŃ NA APLIKACJI
            System.out.println("Wynik dodawania " + addition);
            System.out.println("Odejmowanie " + subtraction);
            System.out.println("Mnożenie " + multiplication);
            System.out.println("Dzielenie " + division);
            System.out.println("Modulo " + mod);

    }
    }
