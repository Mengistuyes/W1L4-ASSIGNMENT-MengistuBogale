package problem3;

public class Main {

	public static void main(String[] args) {
		System.out.println("");
		int[] MySortedIntArray={4,8,11,18,19,28,39,44,55,88,94,101};
		int intToBeSearched=44;
		recursionBinarySearch BSearch=new recursionBinarySearch();
		int ReturnedFunction=BSearch.MyBSearchFunction(MySortedIntArray,intToBeSearched);
		if(ReturnedFunction!=-1)
		{
			System.out.println("The index that contnes " + intToBeSearched + " is: " + ReturnedFunction);
		}
		else
		{
			System.out.println(intToBeSearched + " is not found! Please try again with different number ");
		}
		
	}

}
