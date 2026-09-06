public class StringExample {
    public static void main(String[] args) {
		String word = "hello";
		try {
			System.out.println(word.charAt(7));
		} catch (StringIndexOutOfBoundsException sioobe) {
			System.out.println("Index does not exist");

		}
	}
    
}
