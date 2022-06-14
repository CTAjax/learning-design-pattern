package operation;

/**
 * @author ajax
 */
public class OperationFactory {
    public static Operation create(String symbols) {
        return switch (symbols) {
            case Symbols.ADD -> new AddOperation();
            case Symbols.SUB -> new SubOperation();
            case Symbols.MUL -> new MulOperation();
            case Symbols.DIV -> new DivOperation();
            default -> throw new IllegalArgumentException("symbols not found.");
        };
    }
}
