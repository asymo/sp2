package expression;

/**
 * Represents an Expression of the form e1 + e2.
 * 
 * @author Carsten Fuhs
 */
public class PlusExpression extends BinaryExpression {

    /**
     * Constructs a PlusExpression with left and right as direct subexpressions.
     *
     * @param left the left subexpression; non-null
     * @param right the right subexpression; non-null
     */
    public PlusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int computeValue() {
        return this.getLeft().computeValue() + this.getRight().computeValue(); 
    }

    @Override
    protected String operatorSymbol() {
        return "+";
    }
}
