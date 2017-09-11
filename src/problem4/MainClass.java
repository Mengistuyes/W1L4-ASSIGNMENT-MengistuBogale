package problem4;

public class MainClass {

	public static void main(String[] args) {
		//The obvious solution would be reversing the string but I am not going to use that.
		isItPalindrome CheckPalindrome=new isItPalindrome();

		System.out.println("Is it Palindrome? " + CheckPalindrome.PalindromeOrNot("abcdfhxhfdcba"));
	}
	
	

}
