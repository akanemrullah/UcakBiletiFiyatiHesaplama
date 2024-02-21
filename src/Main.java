import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double mUcret = .10, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre cinsinden gir: ");
        mesafe = input.nextInt();

        System.out.print("Yasini gir: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini gir: ");
        yolculukTipi = input.nextInt();

        total = mesafe * mUcret;

        if (mesafe >= 0 && yas >= 0) {

            switch (yolculukTipi) {

                case 1:
                    if (yas < 12) {
                        total = total - (total * .5);
                    } else if (yas >= 12 && yas <= 24) {
                        total = total - (total * .1);
                    } else if (yas > 65) {
                        total = total - (total * .3);
                    }
                    break;

                case 2:
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
                    break;
                default:
                    System.out.println("Hatali deger girdin.");
                    break;
            }
            System.out.println("Tutar : " + total);

        } else {
            System.out.println("Hatali deger girdin. Tekrar dene");
        }
    }
}