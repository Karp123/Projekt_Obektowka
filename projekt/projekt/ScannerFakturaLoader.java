package projekt;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class ScannerFakturaLoader implements FakturaLoader {
    private Scanner scanner;

    ScannerFakturaLoader(Scanner scanner) {
        this.scanner = scanner;
    } // Ten konstruktor jest wykorzystywany do inicjalizacji obiektu ScannerFakturaLoader z odpowiednim obiektem Scanner.


    public Faktura zaladuj() {
        String typFaktury = this.scanner.nextLine();

        if (!Objects.equals(typFaktury, "fizyczna") && !Objects.equals(typFaktury, "korporacyjna")) {
            return null;
        }

        System.out.println("Podaj imię sprzedawcy:");
        String imieSprzedawcy =  this.scanner.nextLine();
        System.out.println("Podaj nazwisko sprzedawcy:");
        String nazwiskoSprzedawcy  = this.scanner.nextLine();
        System.out.println("Podaj adres sprzedawcy:");
        String adresSprzedawcy = this.scanner.nextLine();
        System.out.println("Podaj NIP sprzedawcy:");
        String nipSprzedawcy = this.scanner.nextLine();
        int dl_nipS = nipSprzedawcy.length();
        if (dl_nipS != 10){
            System.out.println("Podałeś zły NIP !\n");
            System.out.println("Wybierz typ faktury: fizyczna / korporacyjna");
            return null;
        }


        System.out.println("Podaj imie klienta:");
        String imieKlienta = this.scanner.nextLine();
        System.out.println("Podaj nazwisko klienta:");
        String nazwiskoKlienta = this.scanner.nextLine();
        System.out.println("Podaj adres klienta:");
        String adresKlienta = this.scanner.nextLine();
        System.out.println("Podaj NIP klienta:");
        String nipKlienta = this.scanner.nextLine();
        int dl_nipK = nipKlienta.length();
        if (dl_nipK != 10){
            System.out.println("Podałeś zły NIP !");
            return null;
        }

        System.out.println("Podaj nazwe produktu:");
        String nazwaProdukt = this.scanner.nextLine();
        System.out.println("Podaj Jednostke miary produktu: ");
        String jednostkaMiary = this.scanner.nextLine();
        System.out.println("Podaj ilosc produktu:");
        int ilosc = Integer.parseInt(this.scanner.nextLine());
        System.out.println("Podaj cenne netto produktu:");
        BigDecimal cenaNetto = new BigDecimal(this.scanner.nextLine());
        System.out.print("Podaj VAT %: ");
        BigDecimal vat = new BigDecimal(this.scanner.nextLine());


        switch (typFaktury) {
            case "fizyczna":

                return new FakturaKlientFizyczny(
                    new Sprzedawca(
                            imieSprzedawcy,
                            nazwiskoSprzedawcy,
                            adresSprzedawcy,
                            nipSprzedawcy
                    ),
                    new Klient(
                            imieKlienta,
                            nazwiskoKlienta,
                            adresKlienta,
                            nipKlienta
                    ),
                    new Towar(
                            nazwaProdukt,
                            ilosc,
                            cenaNetto,
                            jednostkaMiary,
                            vat
                    )
            );
            case "korporacyjna":
                return new FakturaKlientKorpo(
                        new Klient(
                                imieKlienta,
                                nazwiskoKlienta,
                                adresKlienta,
                                nipKlienta
                        ),
                        new Sprzedawca(
                                imieSprzedawcy,
                                nazwiskoSprzedawcy,
                                adresSprzedawcy,
                                nipSprzedawcy
                        ),
                        new Towar(
                                nazwaProdukt,
                                ilosc,
                                cenaNetto,
                                jednostkaMiary,
                                vat
                        )
                    );
            default:
                return null;
        }
    }
}
