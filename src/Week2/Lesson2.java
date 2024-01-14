package Week2;

public class Lesson2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Faktöriyel: " + factorial(number));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
