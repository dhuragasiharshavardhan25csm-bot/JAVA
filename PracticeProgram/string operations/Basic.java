public class Basic {
	public static void main(String[] args) {

		String str1="   string OperationS    ";
		String str2=new String("World");

		System.out.println(str1);
		
		System.out.println(str2);
		
		System.out.println(str1+" "+str2);
		System.out.println(" ");
		
		
		System.out.println(str1.length());
	    System.out.println(str1.charAt(7));
	    System.out.println(str1.toUpperCase());
	    System.out.println(str2.toLowerCase());
	    System.out.println(str1.substring(16));
	    System.out.println(str2+" "+str1.concat("/////"));
	    System.out.println(str1.indexOf("S"));
	    System.out.println(str1.indexOf("OperationS"));
	    System.out.println(str1.lastIndexOf('i'));
	    System.out.println(str1.replace('i', 'z'));
	    System.out.println(str1.contains("Operati"));
        System.out.println(str1.trim()+"'''");
	}

}
