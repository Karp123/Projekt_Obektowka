package projekt;

import java.util.Scanner;
public class Klient {
    private String imie;
    private String nazwisko;
    private String adres;
    private String nip;

    public Klient(String imie, String nazwisko, String adres, String nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nip = nip;
    }

    public String toString() {
        return  "Imie: " + imie +
                " Nazwisko: " + nazwisko +
                " Adres: " + adres + " NIP: " + nip;
    }

}
