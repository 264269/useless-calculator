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
    }, MOD {
        @Override
        public double action(double[] numbers) {
            return (numbers[0] % numbers[1]);
        }
    }, POW {
        @Override
        public double action(double[] numbers) {
            return (Math.pow(numbers[0], numbers[1]));
        }
    }, SIN {
        @Override
        public double action(double[] numbers) {
            return (Math.sin(numbers[0]));
        }
    };
    public abstract double action(double[] numbers) throws Exception;
}
