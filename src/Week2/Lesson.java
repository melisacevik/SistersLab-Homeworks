package Week2;

public class Lesson {
    public static void main(String[] args) {
        /* 1-100 arası çift sayılar

        for(int i = 2 ; i <= 100 ; i += 2){
            System.out.println(i);
        }

         */

        //çarpım tablosu

        int sonuc;
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                sonuc = i * j;
                System.out.println(i + "x" + j + "=" + sonuc);
            }
        }


    }
}
