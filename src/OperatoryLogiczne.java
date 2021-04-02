public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true; // np. 2>1
        boolean secondValue = false;//np. 2<1
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && operator "i" sprawdza wartość pierwszego i drugiego wyrażenia
        //zwróci true wtedy, gdy wyrażenia skłądowe są równe true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);

        // || - "lub" - true, gdy jedno wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || thirdValue);

        // ! negacja - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!firstValue&&secondValue);

    }
}
