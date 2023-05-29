package projekt;

import java.util.Scanner;

public class Sprzedawca {
    private String imie;
    private String nazwisko;
    private String adres;
    private String nip;

    public Sprzedawca(String imie, String nazwisko, String adres, String nip) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nip = nip;


    }

    public String toString() {
        return " ===== Faktura Klienta Fizycznego ===== \n\n" +
                " ===== Dane Sprzedawcy ===== \n"+
                "Imie: " + imie +
                "  Nazwisko: " + nazwisko +
                "  Adres: " + adres +
                "  NIP: "+ nip + "\n";
    }


}
