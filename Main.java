package projekt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n ===== Witaj w kalkulatorze Faktur ! ===== \n");
        FakturaLoader fakturaLoader = new ScannerFakturaLoader(
                new Scanner(System.in)
        );
        System.out.println(" ===== Ile faktur chcesz dodać ? ===== \n");
        Scanner scanner = new Scanner(System.in);
        int ile = (int) scanner.nextDouble();

        for (int i=0; i<ile; i++) {
            System.out.println("Wybierz typ faktury fizyczna/korporacyjna");
            Faktura loadedFaktura = fakturaLoader.zaladuj();

            if (loadedFaktura == null) {
                System.out.println("Zła nazwa faktury");
                return;
            }
            System.out.println(loadedFaktura);
            System.out.println("Cena brutto "+loadedFaktura.obliczKwoteBrutto()+" zł");
        }

    }
}

