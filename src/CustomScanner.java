import java.util.Scanner;

public class CustomScanner {
    /*public static void main(String[] args) {
        //Pobieramy imię od naszego użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();//Pyta uzytkownika o imię.
        // W miejscu name uzytkownik wpisze Imię i pokaże się wynik
        System.out.println("Cześć " + name + " !");

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);//można to tez zapisać firstNumber * firstNumber

    }
}
