import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn = "Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";

        Studerende st2 = new Studerende("Asta", 22);

        Studerende st3 = new Studerende("Delal", 20, "Albertslund");

        System.out.println("Alle studerende oprettet!");
        System.out.println("*************************");

        // switch (studerende) {
        //    "Lasse" sout studerende.alder
        // }

        while (true) { // Det her er en uendelig løkke
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hvem vil du slå op i databasen? ");
            String nameToFind = scanner.next();
            switch (nameToFind) {
                case "Lasse":
                    System.out.println(st1.alder);
                    break;
                case "Asta":
                    System.out.println(st2.alder);
                    break;
                case "Delal":
                    System.out.println(st3.alder);
                    break;
                default:
                    System.out.println(nameToFind + " er ikke med i min studiegruppe.");
            }
        }


    }

}
