public class TypyProste {
    //liczby staloprzecinkowe
    public static void main(String[] args) {
        byte firstNumber = 127; //1 bajt od -128 do 127
        short secondNumber = 32225; //2 bajty -32768 do 32767
        int thirdNumber = 32766999; // 4 bajty
        long fourthNumber = 2148000L; // 8 bajtów -2^62 do (2^63)-1 - LITERKA "L" OZNACZA ZDEFINIOWANIE ŻE JEST TO LONG

        // liczbny zmiennoprzecinkowe
        float fifthNumber = 4.99934F; // 4 bajty - max około 6-7 liczb po przecinku - LITERKA "F" OZNACZA ZDEFINIOWANIE ŻE JEST TO FLOAT
        double sixthNumber = 3.99999999999999D; //8 bajtów - max ok 15 cyfr po przecinku - LITERKA "D" OZNACZA ZDEFINIOWANIE ŻE JEST TO DOUBLE

        //wartość logiczna
        boolean prawda = true;
        boolean falsz = false;
        //np. jeżeli Twój wiek jest większy od... to mozsz to zrobić itd.

        //pojedynczy znak
        char letter ='A'; //jeżeli uzyjemy "" to będzie string

    }
}
