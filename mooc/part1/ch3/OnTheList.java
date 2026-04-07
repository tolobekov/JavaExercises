package mooc.part1.ch3;

import java.util.ArrayList;

/*
 A program that reads inputs from the user until an empty string is entered. 
 Add the following functionality to it: after reading the inputs
 one more string is requested from the user.
 The program then tell whether that string was found in the list or not. 
*/
public class OnTheList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter strings, please, and submit with an empty string at the end");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals(""))
                break;
            list.add(s);
        }
        System.out.println("Enter one more string to check whether it exists in the list");
        String s = scanner.nextLine();
        if (list.contains(s))
            System.out.printf("%s was found in the list!", s);
        else
            System.out.printf("%s wasnot found!", s);
        scanner.close();
    }
}
