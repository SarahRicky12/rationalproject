package edu.guilford;

import java.util.Random;

public class Rational {
    
//Two attributes that store the numerator and denominator of a rational number
    private int numerator;
    private int denominator;

    Random rand = new Random();

//Constructor that takes no arguments and sets the numerator to 0 and the denominator to 1
    public Rational() {
        //generates a random numerator between -100 and 100
        numerator = rand.nextInt(-100, 100);
        //generates a random denominator between -100 and 100
        denominator = rand.nextInt(-100, 100);
        //If the generator chooses 0 for the denominator, it will agenerate a new random number 
        while (denominator == 0) {
            denominator = rand.nextInt(-100, 100);
        }
        
    }

//A toString method that displays a Rational object 
    public String toString() {
        return numerator + "/" + denominator; //This makes it a fraction (numerator/denominator)
    }

//Second constructor that takes two arguments and uses them to initialize the attributes
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        //Prints out a warning message if the denominator is 0
        if (denominator == 0) {
            System.out.println("Warning: Denominator is 0");
        }
    }

//A new method called "negate" that reverses the sign of the rational number by multiplying the numerator by -1
    public void negate() {
        numerator = numerator * -1;
        //This method should be void because it is not returning anything, only changing the sign of the numerator 
        //It does this by multiplying the numerator by -1 (you don't need to include the denominator)
    }

//A new method that swaps the numerator and denominator 
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
        //This method creates a temporary variable called "temp" and sets it equal to the numerator
        //Then it sets the numerator equal to the denominator and the denominator equal to the temporary variable
    }

    //A new method that turns the rational number into a double 
    public double toDouble() {
        return (double) numerator / denominator;
        //This method should return a double because it is converting the rational number into a decimal
        //It does this by casting the numerator as a double and dividing it by the denominator
        //This is not void because it is creating a new object, which will need to be returned
    }


    //A new method that adds two rational numbers together
    public Rational add(Rational other) {
        //multiply both denominators together to get the new denominator
        int newDenominator = denominator * other.denominator;
        //multiply the first numerator by the second denominator 
        int firstNumerator = numerator * other.denominator;
        //multiply the second numerator by the first denominator
        int secondNumerator = other.numerator * denominator;
        //add the two numerators together to get the new numerator
        int newNumerator = firstNumerator + secondNumerator;
        //create a new rational number with the new numerator and denominator
        Rational newRational = new Rational(newNumerator, newDenominator);
        //return the new rational number
        return newRational;
    }
     
}
