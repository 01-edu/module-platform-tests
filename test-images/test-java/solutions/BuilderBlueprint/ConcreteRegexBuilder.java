public class ConcreteRegexBuilder implements RegexBuilder {
    private Regex regex;

    public ConcreteRegexBuilder() {
        this.regex = new Regex();
    }

    @Override
    public void buildLiteral(String literal) {
        regex.addComponent(literal);
    }

    @Override
    public void buildAnyCharacter() {
        regex.addComponent(".");
    }

    @Override
    public void buildDigit() {
        regex.addComponent("\\d");
    }

    @Override
    public void buildWhitespace() {
        regex.addComponent("\\s");
    }

    @Override
    public void buildWordCharacter() {
        regex.addComponent("\\w");
    }

    @Override
    public Regex getResult() {
        return this.regex;
    }
}
