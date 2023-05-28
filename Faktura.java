package projekt;     //Model logika

import java.math.BigDecimal;

interface Faktura {
    BigDecimal obliczKwoteBrutto();
    Klient getKlient();
    Towar getTowar();
    Sprzedawca getSprzedawca();
}
