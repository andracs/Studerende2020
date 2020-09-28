/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Main {

    public static void main(String[] args) {

        Studerende st1 = new Studerende();
        st1.navn ="Lasse";
        st1.alder = 22;
        st1.by = "Skuderløse";
        st1.studieretning = "Datamatiker";

        Studerende st2 = new Studerende();
        st2.navn ="Asta";
        st2.alder = 22;
        st2.by = "Haslev";
        st2.studieretning = "Datamatiker";

        Studerende st3 = new Studerende();
        st3.navn ="Delal";
        st3.alder = 20;
        st3.by = "Albertslund";
        st3.studieretning = "Datamatiker";

        System.out.println("Studerende oprettet!");

    }

}
