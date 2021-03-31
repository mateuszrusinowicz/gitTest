public class TypyObiektowe {
    public static void main(String[] args) {
        //liczby stałoprzecinkowe
        Byte firstNumber = 127; //1 bajt od -128 do 127
        Short secondNumber = 32225; //2 bajty -32768 do 32767
        Integer thirdNumber = 32766999; // 4 bajty
        Long fourthNumber = 2148000L; // 8 bajtów -2^62 do (2^63)-1 - LITERKA "L" OZNACZA ZDEFINIOWANIE ŻE JEST TO LONG

        // liczbny zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max około 6-7 liczb po przecinku - LITERKA "F" OZNACZA ZDEFINIOWANIE ŻE JEST TO FLOAT
        Double sixthNumber = 3.99999999999999D; //8 bajtów - max ok 15 cyfr po przecinku - LITERKA "D" OZNACZA ZDEFINIOWANIE ŻE JEST TO DOUBLE

        //wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;
        //np. jeżeli Twój wiek jest większy od... to mozsz to zrobić itd.

        //pojedynczy znak
        Character letter ='A'; //jeżeli uzyjemy "" to będzie string

        //ciągi znaków
        String hello = "Hello  Mateusz";

        System.out.println(hello.charAt(0));

    }
}
