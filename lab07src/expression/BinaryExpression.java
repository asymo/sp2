package expression;

/**
 * Abstract class for Expressions with two direct subexpressions.
 * Provides an implementation for size() method. 
 *
 * @author Carsten Fuhs
 */
public abstract class BinaryExpression implements Expression {

    /** the two subexpressions; non-null */
    private Expression left;
    private Expression right;

    /**
     * Constructs a BinaryExpression with left and right as direct subexpressions.
     *
     * @param left the left subexpression; non-null
     * @param right the right subexpression; non-null
     */
    public BinaryExpression(Expression left, Expression right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Illegal Expression null!");
        }
        this.left = left;
        this.right = right;
    }

    /**
     * Getter for the left subexpression.
     *
     * @return the left subexpression
     */
    public Expression getLeft() {
        return this.left;
    }

    /**
     * Getter for the right subexpression.
     *
     * @return the right subexpression
     */
    public Expression getRight() {
        return this.right;
    }

    @Override
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    @Override
    public String toString() {
        // note the use of the abstract protected method operatorSymbol()
        // so that implementing classes do not have to provide a full
        // implementation of toString(), but only need to fill in the
        // "missing part".
        return "(" + this.left + " " + this.operatorSymbol() + " " + this.right + ")";
    }

    /**
     * Subclasses must provide a visual representation of their binary operation.
     *
     * @return a String representation of the binary arithmetic operation
     */
    protected abstract String operatorSymbol();
}
