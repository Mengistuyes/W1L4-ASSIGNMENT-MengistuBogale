package problem2;

public class FindMinCharFromAString {

public char CallMinCharFunc(String Str)
{
	int count=0;
	char Min=' '; 
	return MyMinCharInStringInput(Str,Min,count);
}
public char MyMinCharInStringInput(String Str,char Min,int count)
	    {
	    	if(count==1)//before the first call
	    	{
	    		Str=Str.toLowerCase();
	    		Min=Str.charAt(0);//Assign the first character
	    	}
	    	if(Str.length()<=1)
	    	{
	   	    		return Min;
	    	}
	    	
	    	if(Str.charAt(0)<Str.charAt(1))
	    	{
	    		if(Min>Str.charAt(0))
	    		{
	    			Min=Str.charAt(0);	
	    		}
	    		
	    	}
	     	count++;
	    	return MyMinCharInStringInput(Str.substring(1),Min,count);
	   
	    }
}
