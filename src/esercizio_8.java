public class esercizio_8 {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }
    private static void exercise1 () {
        System.out.println("\nExercise 1:");

        if (2 <= 2 && !true) { // 2 è uguale a 2 (true) mentre !true è uguale a false, il risultato dell'&& è false
            System.out.print("&& = true");
        } else {
            System.out.print("&& = false"); // stampa corretta
        }
    }

    private static void exercise2 () {
        System.out.println("\nExercise 2:");

        if (!false && 3 > 2) {  // !false è uguale a true mentre 3 è maggiore di 2 (true), il risultato di && è true
            System.out.print("&& = true"); // stampa corretta
        } else {
               System.out.print("&& = false");
        }
    }

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        boolean t = false;
        boolean f = true;
        if (!(!t || f)){ //!t e f sono true, entrambi condizionati da ! sono false, il risultato di || è false
            System.out.print("|| = true");
        } else {
            System.out.print("|| = false"); // stampa corretta
        }

    }

    private static void exercise4() {
        System.out.println("\nExercise 4:");

        if (6 > 6 ^ !(true && true)) { //6 non è maggiore di 6 (false) mentre il risultato di && con ! applicato è
            // false, i valori sono uguali quindi il risultato di ^ è false
            System.out.print("^ = true");
        } else {
            System.out.print("^ = false"); // stampa corretta
        }
    }



}