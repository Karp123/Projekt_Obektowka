package projekt;
import java.math.BigDecimal;
public class Towar {
    private String nazwaProdukt;
    private int ilosc;
    private BigDecimal cenaNetto;
    private String jednostkaMiary;
    private BigDecimal vat;

    public Towar(String nazwa_produkt, int ilosc, BigDecimal cena_netto, String jednostkaMiary, BigDecimal vat) {
        this.nazwaProdukt = nazwa_produkt;
        this.ilosc = ilosc;
        this.cenaNetto = cena_netto;                    //konstruktor
        this.jednostkaMiary = jednostkaMiary;
        this.vat = vat;
    }


    public String toString() {
        return  " Towar: " + nazwaProdukt+
                " Jednostka miary: " + jednostkaMiary+       //co zwraca
                " ilsoc: " + ilosc +
                " Cena Netto: " + cenaNetto+
                " Vat: " +vat+"%";
    }





    public int getIlosc() {
        return ilosc;
    }
    public BigDecimal getCenaNetto() {
        return cenaNetto;
    }
    public BigDecimal getVat(){return (vat);}



}
