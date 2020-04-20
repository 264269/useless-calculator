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
    }, COS {
        @Override
        public double action(double[] numbers) {
            return (Math.cos(numbers[0]));
            }
    }, SIN {
        @Override
        public double action(double[] numbers) {
            return (Math.sin(numbers[0]));
        }
    }, XOR {
        @Override
        public double action(double[] numbers) {
            return ((int)numbers[0]^(int)numbers[1]);
        }
    };
    public abstract double action(double[] numbers) throws Exception;
}
