
public class BinarySearch extends TestTimes implements SearchInterface{

	@Override
	public int search(int[] listOfNumbers, int target) {
	//while(0<=listOfNumbers.length) {
		
		int left = 0;
		int right=listOfNumbers.length-1;
		
		
		if(left>right) {
				return -1;
			}
		
		while(left<=right) { //checks all parts of array without overlapping
			int mid=(left+right)/2;
			if(target==listOfNumbers[mid]) {
				return mid;
			}
			else if(target<listOfNumbers[mid]) { //if target value is less than middle element value, then:
				right=mid-1; //we move the new right one left of middle
			} else if(target>listOfNumbers[mid]) {
				left=mid+1;
			} 
			else {
				return mid;
			}
			
			 
		}
		
		//for(int i=mid; i<listOfNumbers.length; i++) {
			//if(listOfNumbers[i]==target) {
				//return i;
			//} //
				
			
		//}
		
	//}
		return -1;
		
		
		 
		 }
		
}


