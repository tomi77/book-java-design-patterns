package demo;

public class StringToBinaryExp implements IExpression {
    private String str;

    public StringToBinaryExp(String str) {
        this.str = str;
    }

    @Override
    public void interpret(Context ic) {
        ic.getBinaryForm(str);
    }
}
