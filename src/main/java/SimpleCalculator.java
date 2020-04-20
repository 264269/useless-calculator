public class SimpleCalculator {
    public double getResult(double[] numbers, String wordOperation) throws Exception{
        return CalculatorOperations.valueOf(wordOperation).action(numbers);
    }
}
