

public class SampleMath {
	public static void main(String[] args)
	{
		int n1,n2;
		java.io.BufferedReader reader1 = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
	    try
	    {
	    System.out.println("Enter first number :");
		String str1 = reader1.readLine();
		n1 = Integer.parseInt(str1);
		System.out.println("Entered number is :" + n1);
	    }
	    catch(Exception ex)
	    {
	    	n1 = 0;
	    	System.out.println("unable to read the number");
	    }
		try
		{
	    System.out.println("Enter second number here :");
	    String str2 = reader1.readLine();
		n2 = Integer.parseInt(str2);
		System.out.println("Entered number is :" + n2);
		}
		catch(Exception ex)
	    {
	    	n2 = 0;
	    	System.out.println("unable to read the number");
	    }
			
		System.out.println(add(n1,n2));
		System.out.println(diff(n1,n2));
		System.out.println(prod(n1,n2));
		
	}
	public static int add(int num1, int num2)
	{
		System.out.println("The sum of two numbers is :");
		return num1+num2;
	}
	
	public static int diff(int num1, int num2)
	{
		System.out.println("The diff of two numbers is :");
		
		return num1-num2;
	}
	
	public static int prod(int num1, int num2)
	{
		System.out.println("The prod of two numbers is :");
		
		return num1*num2;
	}

}
