public class NullPointerExample {
    public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("it cannot perform length() because name contain null means empty");
		}

	}
    
}
