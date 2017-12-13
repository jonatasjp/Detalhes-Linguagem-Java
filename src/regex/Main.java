package regex;

enum C { CANECO };

public class Main{

	public static void main(String[] args) {
		
		System.out.println(validateName("Jonatas"));
		int x = 5;
		System.out.println("x = " + ++x);
		
	}
	
	public static boolean validateName(String name){
		return name.matches("[A-Z][a-zA-Z]*");
	}
	
}
