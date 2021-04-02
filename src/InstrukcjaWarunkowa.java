//Instrukcje warunkowe pozwalają nam określić, które części kodu mają zostać wukonane gdy zostane spełniony warunek
public class InstrukcjaWarunkowa {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;
        if (dzielnik != 0) {// JEŻELI DZIELNIK JEST RÓŻNY OD "0"
            System.out.println("Wynik dzielenia to: " + (dzielna / dzielnik));
        } else{//zostanie uruchomiona tyko wtedy kiedy dziielnik będzie równy 0
            System.out.println("Proszę podaj inną liczbę");//NIE POWINNO SIĘ WYŚIETLAĆ- PATRZ NASTEPNA LEKCJA

        }
    }
}
