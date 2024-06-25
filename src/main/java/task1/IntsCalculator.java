package task1;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return target
                .newFormula()
                .addOperand(arg0 * 1.0)
                .addOperand(arg1 * 1.0)
                .calculate(Calculator.Operation.SUM)
                .result
                .intValue();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return target
                .newFormula()
                .addOperand(arg0 * 1.0)
                .addOperand(arg1 * 1.0)
                .calculate(Calculator.Operation.MULT)
                .result
                .intValue();
    }

    @Override
    public int pow(int a, int b) {
        return target
                .newFormula()
                .addOperand(a * 1.0)
                .addOperand(b * 1.0)
                .calculate(Calculator.Operation.POW)
                .result
                .intValue();
    }
}
