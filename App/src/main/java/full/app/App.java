
public class App {

    public static void main(String[] args) {

        
        final var tokenString = "4 3 2 - 1 + *";

       
        var stack = new Stack<Expression>();

        
        var tokenList = tokenString.split(" ");
        for (var s : tokenList) {
            if (isOperator(s)) {
                
                var rightExpression = stack.pop();
                var leftExpression = stack.pop();
                LOGGER.info("popped from stack left: {} right: {}",
                        leftExpression.interpret(), rightExpression.interpret());
                var operator = getOperatorInstance(s, leftExpression, rightExpression);
                LOGGER.info("operator: {}", operator);
                var result = operator.interpret();
                
                var resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                LOGGER.info("push result to stack: {}", resultExpression.interpret());
            } else {
                
                var i = new NumberExpression(s);
                stack.push(i);
                LOGGER.info("push to stack: {}", i.interpret());
            }
        }
        
        LOGGER.info("result: {}", stack.pop().interpret());
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }

    public static Expression getOperatorInstance(String s, Expression left, Expression right) {
        return switch (s) {
            case "+" -> new PlusExpression(left, right);
            case "-" -> new MinusExpression(left, right);
            default -> new MultiplyExpression(left, right);
        };
    }
}