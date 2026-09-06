public class NegativeArrayExample {
    public static void main(String[] args) {
		int i = -5;
		try {
			int[] numbers = new int[i];
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
			numbers[4] = 50;
			System.out.println(numbers[2]);
			System.out.println("array is created");
		} catch (NegativeArraySizeException na) {
			System.out.println("array size must be positive");
		}
	}

    
}
