public class NumberFormatExample {

    public static void main(String[] args) {
		String value = "helloo";
		try {
			int num = Integer.parseInt(value);
			System.out.println("String converted to number=" + num);
		} catch (NumberFormatException nfe) {
			System.out.println("unable to convert ");
		}
	}
    
}
