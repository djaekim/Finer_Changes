
public class example {
	public static void main (String [] args) {
		int x = 0;
		if (x == 0) {
			System.out.println("if statement");
		}
		else {
			System.out.println("else statement");
		}
		extracted_method();
	}
	public static void extracted_method() {
		try {
			System.out.println("hello");
		}catch(Exception e ) {
			
		}
	}

}
