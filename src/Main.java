import calculator.Calculator;
import calculatoradapter.Ints;
import calculatoradapter.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator(new Calculator());
        System.out.println(calc.mult(5, 7));
        System.out.println(calc.sum(3, 11));
        System.out.println(calc.pow(3, 2));
    }
}
