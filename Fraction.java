/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

import java.util.Scanner;

/**
 <pre>
 * Author:      Marius Panopio 
 * Description: Fraction.java can be used to create a 'fraction' object, 
 *              consisting of two integer variables - 'numerator' and 'denominator'
 * Compiles:    yes
 * Works:       partly*
 * 
 *              *The fractions are created, but the numerators and denominators
 *               are represented as large integers
 * 
 *      7 September - no current fraction reduction
 */
class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int x, int y)
    {
        numerator = x;
        denominator = y;
    }

    public Fraction()
    {
        
    }
    
    /**
     * <pre>
     * Description: This method adds two fractions together
     * Pre:         The two fractions being added must be valid fractions
     *              with a nonzero denominator.
     * Post:        The resulting fraction must be larger than either f1 or f2.
     * </pre>
     */
    public void add(Fraction f1, Fraction f2)
    {
        Fraction result = new Fraction();
        int newNum;
        int newDenom;
        
        if (f1.denominator == 0 || f2.denominator == 0)
        {
//            java.lang.Error("No denominators should be zero.");
            System.out.println("No denominators should be zero.");
//            System.exit(0);
        }
        else if (f1.denominator == f2.denominator)
        {
            numerator = f1.numerator + f2.numerator;
            denominator = f1.denominator;
            
        }
        else
        {
            numerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
            denominator = f1.denominator * f2.denominator;
        }
    }
    
    /**
     * <pre>
     * Description: This method will subtract Fraction f2 from
     *              Fraction f1.
     * Pre:         Two valid fractions must be used.
     * Post:        The resulting fraction must be smaller than Fraction f1.
     * </pre>
     */
    public void sub(Fraction f1, Fraction f2)
    {
        Fraction result = new Fraction();
        int newNum;
        int newDenom;
        
        if (f1.denominator == 0 || f2.denominator == 0)
        {
//            java.lang.Error("No denominators should be zero.");
            System.out.println("No denominators should be zero.");
//            System.exit(0);
        }
        else if (f1.denominator == f2.denominator)
        {
            numerator = f1.numerator - f2.numerator;
            denominator = f1.denominator;
        }
        else
        {
            numerator = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
            denominator = f1.denominator * f2.denominator;
        }
    }
    
    /**
     * <pre>
     * Description: This method prints the fraction in the
     *              format of numerator, denominator
     * Pre:         We must have a valid fraction to print.
     * Post:        
     * </pre>
     */
    public void print()
    {
        System.out.printf("%d, %d\n", numerator, denominator);
//        return (numerator + ", " + denominator);
    }
    
    static public void main(String[] args)
    {
        int num1;
        int denum1;
        int num2;
        int denum2;
        
        Fraction f1;
        Fraction f2;
        Fraction f3;
        Fraction f4;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("input num1 denum1");
        num1 = sc.nextInt();
        denum1 = sc.nextInt();
        sc.nextLine();
        System.out.println("input num2 denum2");
        num2 = sc.nextInt();
        denum2 = sc.nextInt();
        sc.nextLine();
        
        f1 = new Fraction(num1, denum1);
        System.out.println("f1 created");
        f2 = new Fraction(num2, denum2);
        System.out.println("f2 created");
        f3 = new Fraction();
        System.out.println("f3 initialized");
        
        f3.add(f1, f2);
        System.out.println("f3.add(f1, f2);");
        f3.print();
        
        f4 = new Fraction();
        System.out.println("f4 = new Fraction();");
        f4.sub(f3, f2);
        System.out.println("f4.sub(f3, f2);");
        f4.print();
    }
}
