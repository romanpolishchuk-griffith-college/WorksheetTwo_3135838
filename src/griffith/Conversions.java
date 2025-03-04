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
		return "";
	}
	public String switchCase() // change uppercase to lowercase and vice versa
	{
		return "";
	}
}
