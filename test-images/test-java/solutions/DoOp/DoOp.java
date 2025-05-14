public class DoOp {
    public static String operate(String[] args) {
        if (args.length == 3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            switch (args[1]) {
                case "+":
                    return Integer.toString(a + b);
                case "-":
                    return Integer.toString(a - b);
                case "/":
                    if (b != 0)
                        return Integer.toString(a / b);
                    break;
                case "*":
                    return Integer.toString(a * b);
                case "%":
                    if (b != 0)
                        return Integer.toString(a % b);
            }
        }
        return "Error";
    }
}
