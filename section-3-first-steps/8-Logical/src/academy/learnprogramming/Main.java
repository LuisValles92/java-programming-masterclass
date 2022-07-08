package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Summary Operators Java
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // Java Operator Precedence Table
        // https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        boolean isAlien = false;
        if (isAlien)
            System.out.println("It is an alien!");
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // Logical AND operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR operator
        secondTopScore = 81;
        if ((topScore > 90) || (secondTopScore <=90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Equals to operator
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println(isCar);
        }

        if (isCar) {
            System.out.println("This is true");
        }

        // Ternary operator
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient >= 18 ? true : false;
        if (isEighteenOrOver) {
            System.out.println("isEighteenOrOver is true");
        }

        // Challenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
