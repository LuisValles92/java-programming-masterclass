package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        /*
        Char Data Type
        A char occupies two bytes (16 bits)
        Unicode Table
        https://unicode-table.com/es/
         */

        // Too many characters in character literal
        // char myChar = 'DD';
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = Boolean.TRUE;
    }
}
