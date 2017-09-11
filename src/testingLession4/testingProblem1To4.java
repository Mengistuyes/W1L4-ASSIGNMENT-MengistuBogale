package testingLession4;

import static org.junit.Assert.*;

import org.junit.Test;

import problem1.MergeAndSortString;
import problem2.FindMinCharFromAString;
import problem2.MainClass;
import problem3.recursionBinarySearch;
import problem4.isItPalindrome;

public class testingProblem1To4 {

	@Test
	public void MyMinCharInStringInput()
	{
		FindMinCharFromAString MyTestObject=new FindMinCharFromAString();
		//Test Cases	
		assertEquals(MyTestObject.CallMinCharFunc("mengistuyeshiwasbogale"),'a');//All Small letter
		assertEquals(MyTestObject.CallMinCharFunc("MengistuYeshiwasBogale"),'a');//When there is upper case and lower case
		
	}
	@Test
	public void TestingMyMergeAndSortedFun()
	{
		MergeAndSortString SortMyStr=new MergeAndSortString();
		//Test Cases	
		assertEquals(SortMyStr.CallMergeString("afjqrw","Bdjlmoz"),"abdfjjlmoqrwz");
		assertEquals(SortMyStr.CallMergeString("cccccgxxx","ggggyyyz"),"cccccgggggxxxyyyz");//When there is duplication it shouldn't affect the sorting	
		
	}
	@Test
	public void TestingMyBinarySearchFun()
	{
		recursionBinarySearch BSearch=new recursionBinarySearch();
		int[] MySortedIntArray={4,8,11,18,19,28,39,44,55,88,94,101};
		//Test Cases	
		assertEquals(BSearch.MyBSearchFunction(MySortedIntArray,11),2);
		assertEquals(BSearch.MyBSearchFunction(MySortedIntArray,44),7);
	}
	@Test
	public void TestingIfitIsPalindrome()
	{
		
		String Str1="abcdfhxhfdcba";// if (Str2.length()%2!=0)
		String Str2="wabcdfhxhfdcbaa"; //Is not Palindrome
		String Str3="abcdfhhfdcba";// if (Str2.length()%2==0)
		String Str4=null;//not Palindrome
		String Str5="123454321";// Palindrome
		String Str6="";
		
		isItPalindrome Palindrome=new isItPalindrome();
	//	Test Cases		
		boolean ExpectedOutPut1=true;
		assertEquals(Palindrome.PalindromeOrNot(Str1),ExpectedOutPut1);
	
		boolean ExpectedOutPut2=false;
		assertEquals(Palindrome.PalindromeOrNot(Str2),ExpectedOutPut2);

		boolean ExpectedOutPut3=true;
		assertEquals(Palindrome.PalindromeOrNot(Str3),ExpectedOutPut3);

		boolean ExpectedOutPut4=false;
		assertEquals(Palindrome.PalindromeOrNot(Str4),ExpectedOutPut4);

		boolean ExpectedOutPut5=true;
		assertEquals(Palindrome.PalindromeOrNot(Str5),ExpectedOutPut5);

		boolean ExpectedOutPut6=true;
		assertEquals(Palindrome.PalindromeOrNot(Str6),ExpectedOutPut6);

	}
}
