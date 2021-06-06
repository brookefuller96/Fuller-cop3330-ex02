import java.util.Scanner;
import java.io.*;

public class Exercise2 {

    public static void main(String[] args)
    {
        System.out.println("Please enter your input string: ");
        Scanner input = new Scanner(System.in);
        String yourString = input.nextLine();
        System.out.println(yourString + " has " + yourString.length() + " characters!" );

    }

}
