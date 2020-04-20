public class Program {
    public static void main(String[] args) {
        CalculatorUI test = new CalculatorUI();
        try {
            System.out.println(test.doAction());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

