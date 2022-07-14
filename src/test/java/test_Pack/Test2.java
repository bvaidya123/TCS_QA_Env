package test_Pack;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class Test2 
{
	public static void main(String[] args)
	{
		String a="Bhushan";
		String b ="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
//			b=b+a.charAt(i);
			System.out.print(a.charAt(i));
		}
//		System.out.println(b);
	}
}