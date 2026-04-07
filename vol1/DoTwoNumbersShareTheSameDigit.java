import java.lang.System;
import java.util.Locale;

public class DoTwoNumbersShareTheSameDigit {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int x1 = x % 10;
        int x2 = (x / 10) % 10;
        int y1 = y % 10;
        int y2 = (y / 10) % 10;
        if (x1 == y1 || x1 == y2 || y2 == x2 || y1 == x2) {
            System.out.println(true);
        } else
            System.out.println(false);
        s.close();

    }
}
