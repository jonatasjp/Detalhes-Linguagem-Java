package regex;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(validateName("Jonatas"));
		
		
	}
	
	public static boolean validateName(String name){
		return name.matches("[A-Z][a-zA-Z]*");
	}
	
}
