package fraction;

import java.util.Scanner;

/**
 * <pre>
 * author: R. Silverman
 * description: This program will compute fractions. It
 * will have 2 operand operations to do add and subtract.
 *
 * created: 2017/08/22
 * works: 2017/08/22
 * </pre>
 */
public interface FractionIF
{

    /**
     * <pre>
     * Description: This method adds two fractions and assigns result to this
     * object.
     * Pre: We have two initialized fractions.
     * Post: If the denominator is not 0 we have valid result.
     * </pre>
     */
    abstract public void add(Fraction f1, Fraction f2);

    /**
     * <pre>
     * Description: This method sub two fractions and assigns result to this
     * object.
     * Pre: We have two initialized fractions.
     * Post: If the denominator is not 0 we have valid result.
     * </pre>
     */
    abstract public void sub(Fraction f1, Fraction f2);

    /**
     * <pre>
     * Description: This will print the faction: num, denum.
     * Pre: The fraction
     * was initialized.
     * Post: The fraction is printed: num, denum.
     * </pre>
     */
    abstract public void print();

}
