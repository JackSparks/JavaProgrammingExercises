package PrintOutFibonacciSequence;

public class Fibonacci {

	int valueOne = 1;
	int valueTwo = 1;
	int valueThree = 0;

	public void numberIterations(int iteration) {

		// approach one
		System.out.printf("%d\n%d\n", valueOne, valueTwo);
		for (int i = 0; i < iteration - 2; i++) {
			addValue();
		}

	}

	public void addValue() {
		this.valueThree = this.valueOne + this.valueTwo;
		System.out.println(this.valueThree);
		this.valueOne = this.valueTwo;
		this.valueTwo = this.valueThree;

	}

	//approach 2
	public int addValueWithRecursion(int iteration) {

		if (iteration == 1 || iteration == 2) {
			return 1;
		}
		return addValueWithRecursion(iteration - 1) + addValueWithRecursion(iteration - 2);
	}
}
