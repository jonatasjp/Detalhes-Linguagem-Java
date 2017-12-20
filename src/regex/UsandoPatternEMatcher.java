package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsandoPatternEMatcher {

	public static void main(String[] args) {
		
		Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

		String string1 = "Jane's Birthday is 05-12-75\n" 
						+ "Dave's Birthday is 11-04-68\n"
						+ "John's Birthday is 04-28-73\n" 
						+ "Joe's Birthday is 12-17-77";

		// corresponde expressão regular à string e imprime as correspondências
		Matcher matcher = expression.matcher(string1);

		while (matcher.find())
			System.out.println(matcher.group());
		
	}

	public static boolean validateFirstName(String firstName){
		return firstName.matches("[A-Z][a-zA-Z]*");
	}

	// valida sobrenome
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
	}

	// valida endereço
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	// valida cidade
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	// valida estado
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}

	// valida CEP
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}

	// valida telefone
	public static boolean validatePhone(String phone) {
		return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
}
