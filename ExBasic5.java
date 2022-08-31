package variables;

public class ExBasic5 {
	public static void main(String[] args) {
		int a = 18;
		int b = 42;
		int first = (a + b) * 2;
		int second = a + b * 2;
		
		System.out.println(first);
		System.out.println(second);
		// The first print would show: first number is: 120 
		// (Since the calculation in the parentheses will be done first)
		
		// The second print would show: second number is: 102 
		// (since the multiplication will be done first)
	}

}
