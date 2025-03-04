package griffith;

public class Conversions {
	//Convert euro to dollar
	public double euroToDollar(double euro) {
		return Math.max(0, euro * 1.048);
	}
	
	//Convert dollar to euro
	public double dollarToEuro(double dollar){
		return Math.round(Math.max(0, dollar * 0.954198473282));
	}
	
	//Convert string to integer
	public int stringToInteger (String val){
		if(val == null) {
			return 0;
		}
		return (int)Double.parseDouble(val);
	}
	
	//Convert integer to string
	public String integerToString (int val){
		return String.valueOf(val);
	}
	
	//Switch case of a character
	public String switchCase(String string) // change uppercase to lowercase and vice versa
	{
		StringBuilder newStringBuilder = new StringBuilder();
		//Check all characters
		for(int i = 0; i < string.length(); i++) {
			//If character is lower case, set it to upper case  
			if(Character.isLowerCase(string.charAt(i))) {
				newStringBuilder.
					append(Character.toUpperCase(string.charAt(i)));
			}
			//If character is upper case, set it to lower case
			else {
				newStringBuilder.
					append(Character.toLowerCase(string.charAt(i)));
			}
		}
		
		//Return final string
		return newStringBuilder.toString();
	}
}
