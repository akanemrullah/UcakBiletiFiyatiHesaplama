import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler tanimlandi.
        int mesafe, yas, yolculukTipi;
        double mUcret = .10, total;

        // Scanner sinifina ait elemani tanimladik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan yolculuk ile alakali bilgiler alinip bu bilgiler ilgili degiskenlere atandi.
        System.out.print("Mesafeyi kilometre cinsinden gir: ");
        mesafe = input.nextInt();

        System.out.print("Yasini gir: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini gir: ");
        yolculukTipi = input.nextInt();

        // Burada indirimsiz haliyle ucusun toplam fiyatini hesapladik.
        total = mesafe * mUcret;

        // Gerekli mantiksal kontroller ve kosullara uyan indirimler tanimlandi. Ciktimizi yine bu alanda hesapladik.
        if (mesafe >= 0 && yas >= 0) {
            if (yolculukTipi == 1) {
                if (yas < 12) {
                    total -= total * .5;
                } else if (yas >= 12 && yas <= 24) {
                    total -= total * .1;
                } else if (yas > 65) {
                    total -= total * .3;
                }
            } else if (yolculukTipi == 2) {
                if (yas < 12) {
                    total -= total * .5;
                    total -= total * .2;
                    total *= 2;
                } else if (yas >= 12 && yas <= 24) {
                    total -= total * .1;
                    total -= total * .2;
                    total *= 2;
                } else if (yas > 65) {
                    total -= total * .3;
                    total -= total * .2;
                    total *= 2;
                }
            } else {
                System.out.println("Hatali deger girdin.");
            }
            System.out.println("Tutar : " + total + " TL");
        } else {
            System.out.println("Hatali deger girdin.");
        }
    }
}