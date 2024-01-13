package Week2;

public class Lesson {
    public static void main(String[] args) {
        /* 1-100 arası çift sayılar

        for(int i = 2 ; i <= 100 ; i += 2){
            System.out.println(i);
        }

         */

        //çarpım tablosu

        /*
        int sonuc;
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                sonuc = i * j;
                System.out.println(i + "x" + j + "=" + sonuc);
            }
        }

         */

        // 1 ile 50 sayısındaki tüm sayıları topla , 3 ile bölünenler dahil değil
        /*
        int toplam = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) { // 3 ile tam bölünmeyenleri kontrol et
                toplam += i;
            }
        }

        System.out.println(toplam);

         */

        //1-100 arasındaki sayıların toplamını bul 5 veya 7 ye bölünenleri es geç.
        /*
        int toplam = 0;
        for(int i = 0; i <= 100 ; i++){
            if( i % 5 != 0 && i % 7 != 0){
                continue;
            }
            toplam +=i;
        }
        System.out.println("toplam: " + toplam);


         */

        //Asal Sayı
        /*

        boolean asalMi = true;

        for(int i = 1; i <= 100; i++){
            for(int j = 2 ; j < i ; j++){
                if ( i % j == 0){
                    asalMi = false;
                    break;
                }
            }
            if( asalMi && i != 1){
                System.out.println(i);
            }
            asalMi = true;
        }

         */

        // 1-100 arasında ; sayı 3 'e bölünürse fizz 5'e bölünürse buzz  hem3hem5 ise fizzbuzz

        for( int i = 1 ; i <= 100; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz" );
            }else if (i % 3 == 0 ){
                System.out.println("Fizz" );
            }else if( i % 5 == 0 ){
                System.out.println("Buzz" );
            }else{
                System.out.println(i);
            }


        }
    }
}
