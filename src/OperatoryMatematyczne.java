//Operatory Matematyczne umożliwiają wykonanie podstawowych opracji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdtNumber = 4.0F;

int addition = firstNumber + secondNumber;
int subtraction = firstNumber - secondNumber;
int multiplication = firstNumber * secondNumber;
float division = thirdtNumber/secondNumber;
//WARTOŚĆ DZIELENIA NIE POKAZUJE RESZTY PO PRZECINKU
int mod = secondNumber%firstNumber;//reszta z dzielania

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Odejmowanie " + subtraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Modulo " + mod);

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu " + firstNumber);
        firstNumber-=secondNumber;
        System.out.println("po odejmowaniu " + firstNumber);
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu " + firstNumber);
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu " + firstNumber);
        firstNumber%=secondNumber;
        System.out.println("Po modulo " + firstNumber);
    }
}
