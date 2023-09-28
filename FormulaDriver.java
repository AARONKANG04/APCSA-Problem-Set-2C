
/**
 * Kang, Aaron
 * September 27th
 * Problem Set 2C
 */

import java.util.Scanner;

public class FormulaDriver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + roots);
        
        
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2). Enter x1, y1, x2, y2:");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2 ");
        double y2 = input.nextDouble();
        OrderedPair one = new OrderedPair(x1, y1);
        OrderedPair two = new OrderedPair(x2, y2);
        double slope = Formulas.findSlope(one, two);
        System.out.println("The slope between (" + x1 + ", " + y1 +") and (" + x2 + ", " + y2 + ") is " + slope);
        
        
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2), Enter x1, y1, x2, y2:");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2 ");
        y2 = input.nextDouble();
        one = new OrderedPair(x1, y1);
        two = new OrderedPair(x2, y2);
        OrderedPair midpoint = Formulas.findMidpoint(one, two);
        System.out.println("The midpoint between (" + x1 + ", " + y1 +") and (" + x2 + ", " + y2 + ") is " + midpoint);

        
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        
        System.out.println("SUM OF AN ARITHMETIC SERIES. Enter k (number of terms), a (starting term), d (common difference):");
        System.out.print("k: ");
        int k = input.nextInt();
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("d: ");
        double d = input.nextDouble();
        double sum = Formulas.findArithmeticSeriesSum(a, d, k);
        System.out.println("The sum of the arithmetic series is " + sum);
        
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        
        System.out.println("SUM OF AN GEOMETRIC SERIES. Enter k (number of terms), a (starting term), r (common ratio):");
        System.out.print("k: ");
        k = input.nextInt();
        System.out.print("a: ");
        a = input.nextDouble();
        System.out.print("r (cannot be 1.0): ");
        double r = input.nextDouble();
        sum = Formulas.findGeometricSeriesSum(a, r, k);
        System.out.println("The sum of the geometric series is " + sum);
        
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        
        
        System.out.println("DIE ROLLER");
        System.out.println("How many sides does your die have?: ");
        int sides = input.nextInt();
        int roll = Formulas.rollDie(sides);
        System.out.println("Rolling a " + sides + " sided die... you got a " + roll + "!");
    }
}
