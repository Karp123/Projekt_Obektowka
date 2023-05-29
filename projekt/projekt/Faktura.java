package projekt;     //Model logika

import java.math.BigDecimal;

interface Faktura {
    BigDecimal obliczKwoteBrutto();             //Metody
    Klient getKlient();
    Towar getTowar();
    Sprzedawca getSprzedawca();
}
