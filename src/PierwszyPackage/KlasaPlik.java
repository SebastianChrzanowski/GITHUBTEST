package PierwszyPackage;

public class KlasaPlik {



    public KlasaPlik(int cos, String imie, String nazwisko) {
        this.cos = cos;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    int cos;
    String imie;
    String nazwisko;

    public void wypisz(){

        System.out.println("mam na imie " + imie + nazwisko + " i mam lat " + cos);
    }

}
