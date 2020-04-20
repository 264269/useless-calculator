import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorUI {
    //поля

    String operation;
    String wordOperation;
    double[] numbers;
    SimpleCalculator worker;

    //конструкторы

    public CalculatorUI() {
        this.operation = "";
        this.numbers = new double[2];
        this.worker = new SimpleCalculator();
    }

    //методы

    public double doAction() throws Exception {
        if (readOperation() && readNumbers() && operationIntoWord()) {
            return worker.getResult(numbers, wordOperation);
        } else {
            throw new Exception("Error: wrong input.");
        }
    }

    private boolean operationIntoWord() {
        if (this.operation.equals("+")) {
            this.wordOperation = "ADD";
        } else if (this.operation.equals("-")) {
            this.wordOperation = "SUBTRACT";
        } else if (this.operation.equals("*")) {
            this.wordOperation = "MULTIPLY";
        } else if (this.operation.equals("/")) {
            this.wordOperation = "DIVIDE";
        } else {
            return false;
        }
        return true;
    }

    private boolean readOperation() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter operation:");
            this.operation = reader.readLine();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    private boolean readNumbers() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            if (isBinary(this.operation)) {
                System.out.println("Enter first number:");
                this.numbers[0] = Double.parseDouble(reader.readLine());
                System.out.println("Enter second number:");
                this.numbers[1] = Double.parseDouble(reader.readLine());
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    private boolean isBinary(String operation) {
        if (operation.equals("*")
                || operation.equals("+")
                || operation.equals("-")
                || operation.equals("/")) {
            return true;
        } else {
            return false;
        }
    }
}
