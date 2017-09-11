package problem3;

public class recursionBinarySearch {
	int middleOfMyArray =0;
	public int MyBSearchFunction(int[] ContensIntVal, int MyToBeSearchedVal) {
		int CurrentLength= ContensIntVal.length-1;//last element
		int CurrentInitialValue=0;//Start with the first element
	    return MyRecursiveBinarySearchFunc(ContensIntVal,MyToBeSearchedVal,CurrentInitialValue,CurrentLength);
	}

	public int MyRecursiveBinarySearchFunc(int[] ContensIntVal, int MyToBeSearchedVal, int CurrentInitialValue, int CurrentLength) {
	    middleOfMyArray = (CurrentInitialValue + CurrentLength) / 2;
	    if(CurrentLength < CurrentInitialValue) {
	        return -1;
	    } 

	    if(MyToBeSearchedVal==ContensIntVal[middleOfMyArray]) {
	        return middleOfMyArray;
	    } else if(MyToBeSearchedVal<ContensIntVal[middleOfMyArray]) {
	        return MyRecursiveBinarySearchFunc(ContensIntVal, MyToBeSearchedVal, CurrentInitialValue, middleOfMyArray - 1);
	    } else {
	        return MyRecursiveBinarySearchFunc(ContensIntVal, MyToBeSearchedVal, middleOfMyArray + 1, CurrentLength);
	    }
	}

}
