package expression;

/**
 * Class that uses some functionality of Expressions.
 *
 * @author Carsten Fuhs
 */
public class ExpressionMain {
    public static void main(String[] args) {
        // (1+2) * (8 / 2)
        Expression e1 = new IntConstant(1);
        Expression e2 = new IntConstant(2);
        Expression e8 = new IntConstant(8);
        Expression plus = new PlusExpression(e1, e2);
        Expression div = new DivExpression(e8, e2);
        Expression times = new TimesExpression(plus, div);

        Expression[] exps = { e1, e2, e8, plus, div, times };

        for (Expression exp : exps) {
            System.out.println(exp + " has size " + exp.size()
                + " and value " + exp.computeValue());
        }
    }
}
