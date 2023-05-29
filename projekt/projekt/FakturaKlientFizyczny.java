package projekt;

import java.math.BigDecimal;

public class FakturaKlientFizyczny implements Faktura {
    private Sprzedawca sprzedawca;
    private Klient klient;
    private Towar towar;

    public FakturaKlientFizyczny(Sprzedawca sprzedawca, Klient klient, Towar towar) {
        this.sprzedawca = sprzedawca;
        this.klient = klient;
        this.towar = towar;
    }

    public BigDecimal obliczKwoteBrutto() {
        return  towar.getCenaNetto().multiply(new BigDecimal("1").multiply(BigDecimal.valueOf(towar.getIlosc()))).multiply(new BigDecimal("1").add(towar.getVat().divide(new BigDecimal("100"))));
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
        return
                sprzedawca +
                "\n  ===== Dane Klienta ===== \n"+ klient +"\n"+
                "\n  ===== Dane Towaru ===== \n" + towar;
    }
}
