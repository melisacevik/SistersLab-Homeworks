package Week1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*                              Question 1
                            kullanicidan alinan para degerinin KDV'li fiyatini ve
                            KDV tutarini hesaplayip ekrana bastiran programi yazin.
                            KDV tutarini 30%
                            KDV'siz Fiyat = 10;
                            KDV'li Fiyat = 13;
                            KDV tutari = 3;

         */

        /*
        int amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount: ");

        amount = scan.nextInt();

        int KDV = ( ( amount * 30 ) / 100 );
        int amountWithKDV = ( ( amount * 30 ) / 100 ) + amount;

        System.out.print("Amount of KDV: ");
        System.out.println(KDV);
        System.out.print("Amount with KDV: ");
        System.out.println(amountWithKDV);

         */

        /*
                                        Question 2
                        Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 ,
                        tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.
         */
        /*
        int amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount: ");

        amount = scan.nextInt();

        int KDV;
        int amountWithKDV;
        if( amount > 0 && amount < 1000){
            KDV = ( amount * 10 ) / 100;
            amountWithKDV = ( ( amount * 10 ) / 100 ) + amount;
            System.out.print("Amount of KDV: ");
            System.out.println(KDV);
            System.out.print("Amount with KDV: ");
            System.out.println(amountWithKDV);
        } else if (amount > 1000) {
            KDV = ( amount * 22 ) / 100;
            amountWithKDV = ( ( amount * 22 ) / 100 ) + amount;
            System.out.print("Amount of KDV: ");
            System.out.println(KDV);
            System.out.print("Amount with KDV: ");
            System.out.println(amountWithKDV);
        }else{
            System.out.println("Invalid amount");
        }

         */
        /*
                                        Question 3
                                       Not Hesaplama
                        Kullanicidan bir ogrencinin sinav notunu girmesini isteyen ve
                        notun harf notunu hesaplayarak ekrana yazdiran bir Java programi yazin.
                                        (Ornegin,
                                        90-100 arasi AA,
                                        80-89 arasi BA,
                                        70-79 arasi BB,
                                        60-69 arasi CB,
                                        50-59 arasi CC,
                                        0-50 arasi FF)

         */

        /*
        int note;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the note: ");
        note = scan.nextInt();

        if( note >= 90 && note <= 100){
            System.out.println("Congrats!! You got the AA grade");
        } else if (note >= 80 && note <= 89 ) {
            System.out.println("Congrats!! You got the BA grade");
        } else if (note >= 70 && note <= 79 ) {
            System.out.println("You got the BB grade");
        } else if (note >= 60 && note <= 69 ) {
            System.out.println("You got the CB grade");
        } else if (note >= 50 && note <= 59 ) {
            System.out.println("You got the CC grade");
        } else if (note >= 0 && note < 50 ) {
            System.out.println("You got the FF grade");
        }

         */
        /*
                                    Question 4
                                    Basit Hesap Makinesi
                    Kullanicidan iki sayi girmesini isteyen ve ardindan bu
                    iki sayi uzerinde toplama, cikarma, carpma ve bolme
                    islemlerini gerceklestiren bir Java programi yazin.

         */

        /*
        int number1, number2,select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number 1: ");
        number1 = scan.nextInt();
        System.out.print("Please enter the number 2: ");
        number2 = scan.nextInt();
        System.out.print("1-addition 2-subtraction 3- multiplication 4- division \n");
        System.out.print("Your select: ");
        select = scan.nextInt();

        if( select == 1){
            System.out.println("Addition: " + (number1 + number2) );
        }else if( select == 2){
            System.out.println("Subtraction: " + (number1 - number2) );
        }else if( select == 3){
            System.out.println("Multiplication: " + (number1 * number2) );
        }else if( select == 4){
            System.out.println("Division: " + (number1 / number2) );
        }else{
            System.out.println("Invalid operator");
        }

         */

        /*                     Question 5
                            Kullanicidan bir sayi girmesini isteyen ve girilen sayinin tek mi
                            yoksa cift mi oldugunu belirleyen bir Java programini yazin.

         */

        /*
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = scan.nextInt();

        if( number % 2 == 0 ){
            System.out.println("This number is an EVEN number.");
        }else if( number % 2 != 0 ){
            System.out.println("This number is an ODD number.");
        }

         */

        /*                     Question 6
                            Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.
         */

        /*
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number 1: ");
        int number1 = scan.nextInt();
        System.out.print("Please enter the number 2: ");
        int number2 = scan.nextInt();
        System.out.print("Please enter the number 3: ");
        int number3 = scan.nextInt();

        if (number1 >= 0 && number2 >= 0 && number3 >= 0) {
            int max, mid, min;

            if (number1 >= number2 && number1 >= number3) {
                max = number1;
                if (number2 >= number3) {
                    mid = number2;
                    min = number3;
                } else {
                    mid = number3;
                    min = number2;
                }
            } else if (number2 >= number1 && number2 >= number3) {
                max = number2;
                if (number1 >= number3) {
                    mid = number1;
                    min = number3;
                } else {
                    mid = number3;
                    min = number1;
                }
            } else {
                max = number3;
                if (number1 >= number2) {
                    mid = number1;
                    min = number2;
                } else {
                    mid = number2;
                    min = number1;
                }
            }

            System.out.println("Result: " + max + ">" + mid + ">" + min);
        } else {
            System.out.println("Invalid numbers");
        }

         */

        /*
                             Question 7
                             Kullaniciya bir hava durumu kodu girmesini isteyin.
                             Girdigi koda gore hava durumunu ekrana yazdirin. ( switch - case)
         */

        /*

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1-) Raining =>R \n 2-) Snowy => Sn \n 3-) Sunny => Su");
        System.out.print("Please enter the code: ");

        String select = scan.nextLine().toLowerCase();

        switch(select){
            case "r":
                System.out.print("A rainy day");
                break;
            case "sn":
                System.out.print("A snowy day");
                break;
            case "su":
                System.out.print("A sunny day");
                break;
            default:
                System.out.println("Invalid code");
        }

         */

        /*
                                    Question 8
                                  Kullanicdan iki deger alan ve kullanicinin toplama,cikarma,bolme,carpa
                                  islemlerinden birisini sectigi bir hesap makinesi uygulamasi yapin. ( switch/case)
         */

        /*
        int number1, number2, select;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number 1: ");
        number1 = scan.nextInt();
        System.out.print("Please enter the number 2: ");
        number2 = scan.nextInt();
        System.out.print("1-addition 2-subtraction 3-multiplication 4-division \n");
        System.out.print("Your select: ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Division: " + (number1 / number2));
                } else {
                    System.out.println("Division by 0 is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
         */
        /*
                                Question 9
                           Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun.
                           Ardindan, secilen sekle gore gerekli bilgileri alarak alani hesaplayin.
                           (1-Dikdortgen, 2-Kare, 3-Ucgen)
         */

        int shape,action;
        int firstSide, secondSide, base, height, area, perimeter;
        int shortSide, longSide;
        int side;
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Rectangle 2) Square 3) Triangle ");
        System.out.println("Please select a shape: ");
        shape = scan.nextInt();
        System.out.println("Select the action to be performed:");
        System.out.println("1) Area 2) Perimeter");
        action = scan.nextInt();

        switch(shape){
            case 1:
                System.out.println("Please enter the short side: ");
                shortSide = scan.nextInt();
                System.out.println("Please enter the long side: ");
                longSide = scan.nextInt();

                if(action == 1) {
                    area = shortSide * longSide;
                    System.out.print("Area of Rectangle: ");
                    System.out.println(area);
                }else if(action ==2){
                    perimeter = ( shortSide + longSide)* 2;
                    System.out.print("Perimeter of Rectangle: ");
                    System.out.println(perimeter);
                }else{
                    System.out.println("Invalid select");
                }
                break;
            case 2:
                System.out.println("Please enter the side: ");
                side = scan.nextInt();

                if(action == 1){
                    area = side * side;
                    System.out.print("Area of Square: ");
                    System.out.println(area);
                }else if(action == 2) {
                    perimeter = 4 * side;
                    System.out.print("Perimeter of Square: ");
                    System.out.println(perimeter);
                }else{
                    System.out.println("Invalid select");
                }
                break;
            case 3:
                System.out.println("Please enter the first side: ");
                firstSide = scan.nextInt();
                System.out.println("Please enter the second side: ");
                secondSide = scan.nextInt();
                System.out.println("Please enter the base: ");
                base = scan.nextInt();
                System.out.println("Please enter the height: ");
                height = scan.nextInt();

                if(action == 1){
                    area = ( base * height ) / 2;
                    System.out.print("Area of Triangle: ");
                    System.out.println(area);
                }else if( action == 2){
                    perimeter = firstSide + secondSide + base;
                    System.out.print("Perimeter of Triangle: ");
                    System.out.println(perimeter);
                }else{
                    System.out.println("Invalid select");
                }
            break;
        }


    }
}
