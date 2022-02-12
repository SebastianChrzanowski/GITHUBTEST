package PierwszyPackage;

public class Main {
    public static void main(String[] args) {

        KlasaPlik klasaPlik = new KlasaPlik(34,"seba", "chrzan");

        klasaPlik.wypisz();

        KlasaPlik nowy = new KlasaPlik(55, "lala", "trata");
        nowy.wypisz();
    }
}
