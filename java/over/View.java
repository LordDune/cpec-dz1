package over;

public class View {
    /**
     * Метод вывода результата в форматированном виде
     */
    public static String view (double a, String op, double b){
        Double result = null;
        switch (op){
            case "+": result = OverClass.sum(a, b);
                break;
            case "-": result = OverClass.dif(a, b);
                break;
            case "*": result = OverClass.mult(a, b);
                break;
            case "/": result = OverClass.div(a, b);
                break;
        }
        return String.format("%.0f %s %.0f = %.0f", a, op, b, result);
    }
}