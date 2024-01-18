package Week2;

import java.util.Scanner;

public class Week2Homework {

                    // 1) Fibonacci sayılarını özyinelemeli (recursive) olarak bulan program
                    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 .....
    /*
    public static int fibonacci(int n){

        if( n <= 1 ){
            return n;
        }else{
            return fibonacci(n -1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i <= 15; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

     */

                    // 2) Palindrom kontrolü yapan metod:
                    //  1, 4, 8, 99, 101, 363, 4004, 9889, 13531

    /*
    public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        String reversedNumber = new StringBuilder(strNumber).reverse().toString();
                                    // reverse() metodunu kullanmak için => StringBuilder class'ından obje oluşturduk
        return strNumber.equals(reversedNumber);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int user_input = scanner.nextInt();


        if (isPalindrome(user_input)) {
            System.out.println("Girilen sayı bir palindrom.");
        } else {
            System.out.println("Girilen sayı bir palindrom değil.");
        }
    }

     */

                    // 3 - Permutasyon hesaplama

    /*

    public static int faktoriyel(int number){

        if( number == 0 || number == 1 ){
            return 1;
        }else{
            return number * faktoriyel(number -1);
        }
    }

    public static int permutasyon(int n,int r){
        int sonuc = faktoriyel(n) / faktoriyel(n-r);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n sayısı giriniz: ");
        int n = scan.nextInt();
        System.out.print("r sayısı giriniz: ");
        int r = scan.nextInt();

        if( r > n){
            System.out.println("r sayısı n'den büyük olamaz! Yeniden deneyiniz.");
        }else{
            System.out.println("Sonuç: " + permutasyon(n,r));
        }
    }

     */


                    // 4-Girilen sayıyı asal mı kontrol eden program

    /*
    public static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        for( int i = 2; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();

        if (isPrime(n)) {
            System.out.println("Girilen sayı asal.");
        } else {
            System.out.println("Girilen sayı asal değil.");
        }

    }

     */

                        // 5- Hesap Makinesi Örneği
    /*
    public static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    public static int minus(int a,int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    public static int multiply(int a,int b){
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }
    public static int divided(int a,int b){

        if( b == 0){
            System.out.print("2. sayı 0'dan küçük olamaz!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme: " + result);
        return result;
    }

    public static int power(int a,int b){

        int result = 1;
        for( int i = 1; i <= b ; i++){
            result *= a;
        }

        return result;
    }

    public static int mod(int a, int b){
        int result = a % b;
        return result;
    }

    public static int factorial(int a){
        int result = 1;
        for(int i = 1 ; i <= a; i++){
            result *= i;
        }
        System.out.println("Faktöriyel: " + result);
        return result;
    }
    public static void calc(int a,int b){
        System.out.println("Çevre: " + ( 2 * (a +b)));
        System.out.println("Alan: " + ( a * b) );
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        int a = 0;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8- Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            } else {
                System.out.print("1. sayıyı giriniz: ");
                a = input.nextInt();

                System.out.print("2. sayıyı giriniz : ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        multiply(a, b);
                        break;
                    case 4:
                        divided(a, b);
                        break;
                    case 5:
                        System.out.println("Üs hesabı " + power(a, b));
                        break;
                    case 7:
                        System.out.println("Mod: " + mod(a, b));
                        break;
                    case 8:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem girdiniz!");
                }
            }
        }
        System.out.println("Bye");
    }

     */


}
