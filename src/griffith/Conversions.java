package griffith;

public class Conversions {
	public double euroToDollar(double euro) {
		return Math.max(0, euro * 1.048);
	}
	public double dollarToEuro(double dollar){
		return Math.round(Math.max(0, dollar * 0.954198473282));
	}
	public int stringToInteger (String val){
		if(val == null) {
			return 0;
		}
		return (int)Double.parseDouble(val);
	}
	public String integerToString (int val){
		return String.valueOf(val);
	}
	public String switchCase(String string) // change uppercase to lowercase and vice versa
	{
		StringBuilder newStringBuilder = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				newStringBuilder.
					append(Character.toUpperCase(string.charAt(i)));
			}
			else {
				newStringBuilder.
					append(Character.toLowerCase(string.charAt(i)));
			}
		}
		return newStringBuilder.toString();
	}
}
