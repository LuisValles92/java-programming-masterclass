package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        /*
        Single and Double Precision:
        Single precision occupies 32 bits
        Double precision occupies 64 bits (recommended use)
        */

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minium value = " + myMinFloatValue);
        System.out.println("Float maxium value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minium value = " + myMinDoubleValue);
        System.out.println("Double maxium value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5;
        // Required type: float
        // myFloatValue = 5.25;
        // Casting (no recomendado)
        myFloatValue = (float) 5.25;
        // Recomendado
        myFloatValue = 5.25f;
        myFloatValue = 5f / 3f;
        double myDoubleValue = 5.25d;
        myDoubleValue = 5d / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
