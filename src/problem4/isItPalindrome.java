package problem4;

public class isItPalindrome {
	
	public boolean PalindromeOrNot(String Str)
	{		
		return isPalindromeOrnot(Str=(Str!=null)? Str.toLowerCase():Str);
	}
	private boolean isPalindromeOrnot(String Str)
	{
		if(Str==null)
		{
			return false;
		}
		if(Str.length()<=1)
		{
			return true;
		}
		else if(Str.charAt(0)==Str.charAt(Str.length()-1))
		{
			return isPalindromeOrnot(Str.substring(1,Str.length()-1));
		}
		
		return false;
	}
}
