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
        } else if (this.operation.equals("%")) {
            this.wordOperation = "MOD";
        } else if (this.operation.equals("^")) {
            this.wordOperation = "POW";
        } else if (this.operation.equals("cos")) {
            this.wordOperation = "COS";
        } else if (this.operation.equals("sin")) {
            this.wordOperation = "SIN";
        } else if (this.operation.equals("xor")) {
            this.wordOperation = "XOR";
        } else if (this.operation.equals("tan")) {
            this.wordOperation = "TAN";
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
            } else if (isUnary(this.operation)) {
                System.out.println("Enter number:");
                this.numbers[0] = Double.parseDouble(reader.readLine());
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
                || operation.equals("/")
                || operation.equals("%")
                || operation.equals("^")
                || operation.equals("xor")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isUnary(String operation) {
        if (operation.equals("cos")
                || operation.equals("sin")
                || operation.equals("tan")) {
            return true;
        } else {
            return false;
        }
    }
}
