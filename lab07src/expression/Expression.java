package expression;

/**
 * Basic interface for arithmetic expressions.
 *
 * @author Carsten Fuhs
 */
public interface Expression {

    /**
     * Computes the int value represented by this Expression.
     *
     * @return the int value represented by this Expression
     */
    int computeValue();

    /**
     * Computes the size of this Expression, i.e., the number
     * of its subexpressions.
     *
     * @return the size of this Expression.
     */
    int size();
}
