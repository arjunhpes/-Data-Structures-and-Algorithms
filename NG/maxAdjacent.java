package Array;

public class maxAdjacent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18, 11, 27, 12,14};
		findTotalFeet(arr);;
	}
	
	public static int MaxDiff(int[] array){
		
	    int diff = 0;

	    if (array.length == 0){ 
	        return -1;
	    }
	    int sum = 0;
	    for (int i = 0; i < array.length-1; ++i){

	        diff = Math.abs(array[i] - array[i+1]);
	        sum = sum + diff ;  
	    }
	   // System.out.println("Total :   ");
	    return sum;
	} 

	public static void largestDiff(int [] arr) {
		int max = arr[0];
		
		for ( int i = 1; i < arr.length ; i++) {
			
			if ( arr[i] > max) {
				max =  arr[i];
				}		
		}
		System.out.println(max);
		
		int min = arr[0];
		for ( int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
				
		System.out.println(min);
		
		
		System.out.println(max - min);
}

	public static void findOddEvenDiff(int[] arr) {
			
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
		}
		
		System.out.println("Even : " + evenSum);
		System.out.println("Odd : " + oddSum);
		
		System.out.println(oddSum - evenSum);
		
	}
	
	public static void findTotalFeet(int[] arr) {
		int sum = 0;
		for ( int i = 0; i < arr.length ; i++) {
			
			int digit = arr[i] / 12 ;
			System.out.println(i+1+ "." + digit);
			sum += digit;
			
		}
		
		System.out.println(sum);
	}


	




}
