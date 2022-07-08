package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        /*
        Size of Primitive Types and Width:
            A byte occupies 8 bits
            A short occupies 16 bits
            A int occupies 32 bits
            A long occupies 64 bits
        */

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minium Value = " + myMinByteValue);
        System.out.println("Byte Maxium Value = " + myMaxByteValue);

        // Edit > Find > Replace (Match Case)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        // Required type: short
        // short bigShortLiteralValue = 32768;
        System.out.println("Short Minium Value = " + myMinShortValue);
        System.out.println("Short Maxium Value = " + myMaxShortValue);

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minium Value = " + myMinIntValue);
        System.out.println("Integer Maxium Value = " + myMaxIntValue);
        // Overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // Integer number too large
        // int myMaxIntTest = 2147483648;
        int myMaxIntTest = 2_147_483_647;
        
        long myLongValue = 100;
        // Integer number too large
        // long bigLongLiteralValue = 2_147_483_648;
        long bigLongLiteralValue = 2_147_483_648L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Big Long Literal Value = " + bigLongLiteralValue);
        System.out.println("Long Minium Value = " + myMinLongValue);
        System.out.println("Long Maxium Value = " + myMaxLongValue);

        // Casting
        int myTotal = (myMinIntValue / 2);
        // Required type: byte
        // byte myNewByteValue = (myMinByteValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
