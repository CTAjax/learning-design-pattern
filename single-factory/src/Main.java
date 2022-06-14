import operation.Operation;
import operation.OperationFactory;
import operation.Symbols;

/**
 * @author ajax
 */
public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.create(Symbols.ADD);
        double result = operation.getResult(1, 2);
        System.out.println(result);
    }
}
