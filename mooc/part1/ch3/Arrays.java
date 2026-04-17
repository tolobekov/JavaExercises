package mooc.part1.ch3;

import java.util.Scanner;
/*
Write a program that reads names and birth years from the user until an empty line is entered. 
The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. 
If multiple names are equally longest, you can print any of them. 
You can assume that the user enters at least one person.
*/

public class Arrays {
    public static void main(String[] args) {
        String text;
        Scanner s = new Scanner(System.in);
        Integer cnt = 0;
        String longestName = "";
        Integer sum = 0;
        while (true) {
            text = s.nextLine();
            if (text.isEmpty())
                break;
            String[] pieces = text.split(",");
            if (longestName.length() < pieces[0].length()) {
                longestName = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            cnt++;

        }
        System.out.println("the longest anme is " + longestName);
        System.out.println("Average of the birth years is " + 1.0 * sum / cnt);
        s.close();
    }
}
