public class Task01 {
    public void main() {


        int intOperandA = 9;
        int intOperandB = 2;
        int intSum = 5;
        int intProduct = 7;
        int intDifference = 4;
        int intQuotient = 20;
        int intModulo = 9;

        double doubleOperandA = 3.50;
        double doubleOperandB = 1.25;
        double doubleSum = 12.12;
        double doubleProduct = 18.99;
        double doubleDifference = 79.26;
        double doubleQuotient = 73.33;

        intSum = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        System.out.println();
        System.out.println("The sum using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleDifference);
        System.out.println("The product using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + intOperandA + " & " + intOperandB + " is " + doubleQuotient);
        System.out.println("\n\n\n");
        double myLunchCost = 12.50;
        int numberOfKidsInMyFamily = 2;
        boolean isRainingStatus = false;
        int myFavNum = 7;
        double myShoeSize = 10;
        String myBirthMonth = "February";
        String myFullName = "Nahom Aregai";

        System.out.println("The cost of my lunch is " + myLunchCost);
        System.out.println("The number of kids in my family is " + numberOfKidsInMyFamily);
        System.out.println("Is it raining: " + isRainingStatus);
        System.out.println("My favorite number is " + myFavNum);
        System.out.println("I wear a shoe size of " + myShoeSize);
        System.out.println("I was born in the month of " + myBirthMonth);
        System.out.println("Hi, my full name is " + myFullName);
    }
}
