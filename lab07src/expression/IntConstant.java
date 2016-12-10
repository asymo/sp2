package expression;

/**
 * Expression that represents an int value.
 *
 * @author Carsten Fuhs
 */
public class IntConstant implements Expression {

    /** stores the encapsulated value */
    private int value;

    /**
     * Constructs a new IntConstant encapsulating value.
     *
     * @param value to be encapsulated in this IntConstant
     */
    public IntConstant(int value) {
        this.value = value;
    }

    /**
     * @return the int value this IntConstant stands for
     */
    public int getValue() {
        return this.value;
    }

    @Override
    public int computeValue() {
        return this.value;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
