
public class Driver implements DriverInterface {

	public static void main(String[] args) {
		 
		
	TestTimes tt = new TestTimes();
	LinearSearch ls = new LinearSearch();
	BinarySearch bs = new BinarySearch();
	System.out.println(tt.getAverageTestTime());
	
	
	}

	@Override
	public int[] getListOfNumbers() {
		int[] listOfNumbers = new int [10000000];
		for(int i=0; i< listOfNumbers.length; i++) {
			listOfNumbers[i] = (i+1);
		}
		return listOfNumbers;
	}

	@Override
	public int[] getTargets() {
		int[]listOfNumbers= {500, 10000, 100000, 1000000, 5000000, 7500000, 10000000};
		return listOfNumbers;
	}

	@Override
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		LinearSearch ls = new LinearSearch();
		
		for(int i=0; i<numberOfTimes; i++) {
			long start= System.nanoTime();
			ls.search(listOfNumbers, target);
			long end=System.nanoTime();
			ls.addTestTime(end-start);
		}
		
		return ls;
		
		
		
	}

	@Override
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		BinarySearch bs = new BinarySearch();
		
		for(int i=0; i<numberOfTimes; i++) {
			long start= System.nanoTime();
			bs.search(listOfNumbers, target);
			long end=System.nanoTime();
			bs.addTestTime(end-start);
		}
		
		return bs;
		
	}

}
