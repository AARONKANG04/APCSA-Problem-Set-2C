
/**
 * Kang, Aaron,
 * September 27th
 * Problem Set 2C
 */

import java.lang.Math;

public class Formulas {
    public static OrderedPair findQuadraticRoots(double a, double b, double c) {
        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        return new OrderedPair(root1, root2);
    }
    
    public static double findSlope(OrderedPair a, OrderedPair b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return dy/dx;
    }
    
    public static OrderedPair findMidpoint(OrderedPair a, OrderedPair b) {
        double xm = a.getX() - (a.getX() - b.getX())/2;
        double ym = a.getY()- (a.getY() - b.getY())/2;
        return new OrderedPair(xm, ym);
    }
    
    public static double findArithmeticSeriesSum(double a, double d, int k) {
        return ((double)k/2)*(2*a + d * (k - 1));
    }
    
    public static double findGeometricSeriesSum(double a, double r, int k) {
        assert k > 0 : "k must be greater than 0";
        assert r != 1 : "r cannot be 1.0";
        return a * ((1 - Math.pow(r, k))/(1-r));
    }
    
    public static int rollDie(int sides) {
        return (int)(Math.random()*sides) + 1;
    }
}
