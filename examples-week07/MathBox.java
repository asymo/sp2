public class MathBox<E extends Number> extends Box<Number> {

    public MathBox(E data) {
        super(data);
    }

    public double sqrt() {
        // we can now use the method
        //   double doubleValue()
        // from Number
        return Math.sqrt( getData().doubleValue() );
    }
}
