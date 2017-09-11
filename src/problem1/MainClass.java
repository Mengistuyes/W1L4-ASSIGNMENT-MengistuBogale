package problem1;

public class MainClass {

	public static void main(String[] args) {
		String str1="afjqrw";
		String str2="Bdjlmoz";
		
		MergeAndSortString SortMyStr=new MergeAndSortString();
		String ReturnedSortedString=SortMyStr.CallMergeString(str1,str2);
		System.out.println("These are you inputs : " + str1 + " and " + str2);
		System.out.print("Merged and Sorted string : ");
		System.out.print(ReturnedSortedString);			
	}

}
