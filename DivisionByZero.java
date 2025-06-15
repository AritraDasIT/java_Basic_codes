/* Define a class "Fraction" that contains three integer data members "numerator", "denominator", and "quotient". Write the following methods:
construct a Fraction object that initializes numerator" and denominator"
to user defined integers and "quotient" to zero.
i)
divide "numerator" by denominator" of a "Fraction" object and store that
in "quotient".
Create an exception class "DivisionByZero". Add the code to throw this exception from the divide method
Write a main method to:
create a "Fraction" object
ii) define a try-catch block to call divide method on that object with suitable
exception object.  */


// Custom exception class
class DivisionByZero extends Exception {
    public DivisionByZero(String message) {
        super(message);
    }
}

// Fraction class
class Fraction {
    private int numerator;
    private int denominator;
    private int quotient;

    // Constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.quotient = 0;
    }

    // Method to divide and store quotient
    public void divide() throws DivisionByZero {
        if (denominator == 0) {
            throw new DivisionByZero("Error: Division by zero is not allowed.");
        }
        quotient = numerator / denominator;
        System.out.println("Quotient: " + quotient);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // You can change these values to test different cases
        Fraction f = new Fraction(10, 0); // Try changing 0 to a non-zero value

        try {
            f.divide();
        } catch (DivisionByZero e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
