package edu.guilford;

public class App {
    public static void main(String[] args) {

        // Test the empty constructor in the Rational class
        Rational number1 = new Rational();
        System.out.println("Number 1 = " + number1);

        // Test the toString method in the Rational class
        System.out.println("Number 1 (toString) = " + number1.toString());

        // Test the constructor with parameters
        Rational number2 = new Rational(3, 4);
        System.out.println("Number 2 = " + number2.toString());
        System.out.println("Prediction of Number 2 (negate) = -3/4");

        // Test the negate method on the second number
        number2.negate();
        System.out.println("Number 2 (negate)= " + number2.toString());

        //Test the invert method on a new number
        Rational number3 = new Rational(5, 6);
        System.out.println("Number 3 = " + number3.toString());
        System.out.println("Prediction of Number 3 (invert) = 6/5");
        number3.invert();
        System.out.println("Number 3 (invert) = " + number3.toString());

        //Two new rational number 
        Rational number5 = new Rational(1,2);
        Rational number6 = new Rational(3,4);
        //Print both numbers 
        System.out.println("Number 5 = " + number5.toString());
        System.out.println("Number 6 = " + number6.toString());
        //Add the two numbers together
        Rational number7 = number5.add(number6);
        //Print the sum of the two numbers
        System.out.println("The predicted sum of 5 & 6 = 10/8");
        System.out.println("Sum of Number 5 & 6 based on computer = " + number7.toString());


        Rational number8 = new Rational(1,0);
        System.out.println("Number 8 = " + number8.toString());
        
        //Create a new rational number with the random generator
        Rational number9 = new Rational();
        //Print the new rational number
        System.out.println("Number 9 (random) = " + number9.toString());
    }
}
