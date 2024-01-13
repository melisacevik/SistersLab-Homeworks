package Week1;

import java.util.Scanner;

public class Week2Lesson {
    public static void main(String[] args) {

        // kullanıcıdan sürekli sayı isteyin ve faktöriyeli hesaplayınız.
        // 2.hafta

        /*

        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyelini hesaplamak istediğiniz sayıyı girin: ");

        int sayi = scan.nextInt();
        int faktoriyel = 1;
        int i = 1;
        int counter = 1;

        while(counter < 5){

            while (i <= sayi) {
                faktoriyel *= i;
                i++;
            }

            System.out.println("Sonuc : " + faktoriyel);
            System.out.println("Faktoriyelini hesaplamak istediğiniz sayıyı girin: ");
            sayi = scan.nextInt();
            faktoriyel =1;
            i = 1;
            counter++;



        }

         */

        //Bir öğrencinin sinav notlarını giriş olarak alın ve bu notların ortalamasını alınız.
        /*
        Scanner scan = new Scanner(System.in);
        int i = 0 ;
        double toplam = 0 ;

        while ( i < 3) {
            System.out.println("Lütfen not giriniz: ");
            double not = scan.nextDouble();
            toplam += not ;
            i++;
        }

        System.out.println("Ortalama " + (toplam / 3));

         */

        // Kaç dersin olduğunu bilmiyorsak ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ders sayısını giriniz: ");
        int dersSayisi = scan.nextInt();

        int toplamNot = 0 ;
        int sayac = 0;

        while ( sayac < dersSayisi) {
            System.out.println((sayac + 1 )+ "." + "notunuz: ");
            int not = scan.nextInt();
            toplamNot += not;
            sayac++;
        }

        double ortalama = (double) toplamNot / dersSayisi;
        System.out.println("Not ortalaması: " + ortalama);

    }
}
