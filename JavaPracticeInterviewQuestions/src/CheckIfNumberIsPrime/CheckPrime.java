package CheckIfNumberIsPrime;

public class CheckPrime {

	public boolean checkIfPrime(int z) {
		
		boolean isPrime = true;

		if (z == 2) {
			System.out.printf("" + z);
			return isPrime;
		} else {

			for (int i = 2; i < z/2+1; i += 1) {
				if(z%i==0) {
					System.out.printf(z + " is divisible by " + i + "\n");
					isPrime = false;
				}
				
			}
		}
		return isPrime;
	}
}
