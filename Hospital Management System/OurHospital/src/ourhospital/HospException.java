package ourhospital;

public class HospException extends Exception{
	
	public String getMessage1()
	{
		String str = "No Data found";
		return str;
	}
	public String getMessage2()
	{
		String str = "Enter proper ID starting with D";
		return str;
	}

}
