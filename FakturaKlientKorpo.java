package projekt;

import java.math.BigDecimal;

public class FakturaKlientKorpo implements Faktura {
    private Klient klient;
    private Sprzedawca sprzedawca;
    private Towar towar;

    public FakturaKlientKorpo(Klient klient, Sprzedawca sprzedawca, Towar towar) {
        this.klient = klient;
        this.sprzedawca = sprzedawca;
        this.towar = towar;
    }


    public BigDecimal obliczKwoteBrutto() {
        return  towar.getCenaNetto().multiply(new BigDecimal("1.2").multiply(BigDecimal.valueOf(towar.getIlosc()))).multiply(towar.getVat());
    }


    public Klient getKlient() {
        return this.klient;
    }

    public Towar getTowar() {
        return this.towar;
    }
    public Sprzedawca getSprzedawca() {
        return this.sprzedawca;
    }

    public String toString() {
        return "FakturaKlientFizyczny{" +
                "  sprzedawca=" + sprzedawca +
                "  klient=" + klient +
                "  towar=" + towar;
    }
}
