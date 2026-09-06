public class ArrayStoreExample {
	    public static void main(String[] args) {
	        try {
	    	String[] Student=new String[3];
	        Object[] o=Student;
	        o[0]=579;
	        o[1]="hi";
	        o[2]="hello";
	        for (int i = 0; i < 3; i++) {
	            System.out.println(o[i]);
	        }
	        }catch(ArrayStoreException ase) {
	        	System.out.println("array must contain Strings");
	        }


	    }
	}