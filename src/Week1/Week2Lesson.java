package Week1;

import java.util.Scanner;

public class Week2Lesson {
    public static void main(String[] args) {

        // kullanıcıdan sürekli sayı isteyin ve faktöriyeli hesaplayınız.
        // 2.hafta

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

    }
}
