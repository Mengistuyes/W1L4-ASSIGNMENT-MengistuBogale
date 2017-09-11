package problem1;

public class MergeAndSortString {
		
	public String CallMergeString(String Str1,String Str2)
	{
		 String MergedStr="";
		 int count=0;
		return MergeMySortedString(Str1,Str2,MergedStr,count);	
	}
	public String MergeMySortedString(String Str1,String Str2,String MergedStr,int count)
	{
		if(count==0)//Change it the string to lower case
		{
			Str1=Str1.toLowerCase();
			Str2=Str2.toLowerCase();
			count++;
		}
		if((Str1.length()<=0))
		{
			MergedStr+=Str2;
			return MergedStr;
		}
		else if((Str2.length()<=0))
		{
			MergedStr+=Str1;
			return MergedStr;
		}
		if(Str1.charAt(0)>Str2.charAt(0))
		{
			MergedStr+=Str2.charAt(0);			
			return MergeMySortedString(Str1,Str2.substring(1),MergedStr,count);
		}
		else
		{
			MergedStr+=Str1.charAt(0);
			return MergeMySortedString(Str1.substring(1),Str2,MergedStr,count);
		}
	
	}
	
}
