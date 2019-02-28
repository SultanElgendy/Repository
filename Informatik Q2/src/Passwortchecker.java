
public class Passwortchecker
{
	static char[] charArray;
	
	public static void main(String[]args)
	{
		
		zuCharArray("Passwort");
		Character.isDigit(1);

	}

	public static void zuCharArray(String test)
	{
		System.out.println(test);
		charArray = test.toCharArray();
		System.out.println(charArray[2]);
		System.out.println();
		
		for (int i = 0; i< charArray.length; i++)
		{
			if (Character.isUpperCase(charArray[i]))
			{
				System.out.println(charArray[i] + "ist ein Großbuchstabe!");
			}
			else 
			{
				System.out.println(charArray[i] + "ist kein Großbuchstabe!");
			}
			
			
				for (int j = 0; i< charArray.length; j++)
				{
					if (Character.isDigit(charArray[j]))
					{
						System.out.println(charArray[j] + "ist eine Zahl!");
					}
					else 
					{
						System.out.println(charArray[j] + "ist keine Zahl!");
					}
				}
				for (int j = 0; i< charArray.length; j++)
				{
					if (Character.isDigit(charArray[j]))
					{
						System.out.println(charArray[j] + "ist eine Zahl!");
					}
					else 
					{
						System.out.println(charArray[j] + "ist keine Zahl!");
					}
				}
				
		}
	 }		
}		
	
	