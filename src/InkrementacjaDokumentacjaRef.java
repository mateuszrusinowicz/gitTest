public class InkrementacjaDokumentacjaRef {
    public static void main(String[] args) {

        //inkrementacj zwiękzenie wartości o jeden
        //wystepuje postinterkrementacja - po i preintekrementacja

        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;
        System.out.println("Wartość b: " + b);// 0 - napierw przypisuje wartość, ++ dodaje wartość 1-ale nie tu
        System.out.println("Wartość a: " + a);//wzrosnie o 1, bo a++
        int c = ++a;
        System.out.println("Wartość c: " + c);//ikremetacja dodaj na początku ++, a później przypisze "a"
        System.out.println("Wartość a: " + a);

        //dekrementacja zmniejszenie wartości o 1
        int d = 0;
        System.out.println("WARTOŚĆ D " + d);
        int e = d--;
        System.out.println("WARTOŚĆ E " + e);
        System.out.println("WARTOŚĆ D " + d);
        int f = --d;
        System.out.println("WARTOŚĆ F " + f);
        System.out.println("WARTOŚĆ D " + d);


    }
}
