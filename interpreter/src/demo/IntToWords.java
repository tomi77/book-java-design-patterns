package demo;

public class IntToWords implements IExpression {
    private String str;

    public IntToWords(String str) {
        this.str = str;
    }

    @Override
    public void interpret(Context ic) {
        ic.prinitInWords(str);
    }
}
