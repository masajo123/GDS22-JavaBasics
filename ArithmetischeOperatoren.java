public class ArithmetischeOperatoren {

    /**
     * Ausführung aller Rechenoperationen und Ausgabe
     *
     * @param args
     */
    public static void main(String[] args) {
        // deklarieren und initialisieren
        int a = 4;
        int b = 5;
        int result;

        //addieren
        result = a + b;
        System.out.println("Result: " + result);

        //subtrahieren
        result = a - b;
        System.out.println("Result: " + result);

        //multiplizieren
        System.out.println("Mulitplikation: " + (a * b));

        //dividieren
        //Typumwandlung von int auf double
        double div = (double) a / (double) b;
        System.out.println("Division: " + div);
        //zweite Variante
        // double div = a / (1.0 xb);

        //Restwert - Modulo
        result = a % b;
        System.out.println("Result: " + result);



/*
    int addition = a + b;
    int subtraktion = a - b;
    int multiplikation = a * b;
    int division = a/b;
    int modulo = a%b;

        System.out.println("Addieren: " + addition);
        System.out.println("Subtrahieren: " + subtraktion);
        System.out.println("Multiplizieren: " + multiplikation);
        System.out.println("Dividieren: " + division);
        System.out.println("Modulo: " + modulo);
*/


    }


}
