public class ArrayExample {
    
	public static void main(String[] args) {
		int number[] = { 10, 20, 30 };
		try {
			System.out.println(number[1]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("index does not exist");
		}
	}

}
