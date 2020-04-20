public enum CalculatorOperations{
    ADD {
        @Override
        public double action(double[] numbers) {
            return (numbers[0] + numbers[1]);
        }
    }, SUBTRACT {
        @Override
        public double action(double[] numbers) {
            return (numbers[0] - numbers[1]);
        }
    }, MULTIPLY {
        @Override
        public double action(double[] numbers) {
            return (numbers[0] * numbers[1]);
        }
    }, DIVIDE {
        @Override
        public double action(double[] numbers) {
            return (numbers[0] / numbers[1]);
        }
    };
    public abstract double action(double[] numbers) throws Exception;
}
