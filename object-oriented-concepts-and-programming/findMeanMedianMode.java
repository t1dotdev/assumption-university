package hwSolution;
import java.util.Arrays;
public class findMeanMedianMode {
	public static double findMean(double[] arr){
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum/arr.length;
	}
	
	public static double findMedian(double[] arr){
		Arrays.sort(arr);
		if (arr.length%2 == 1)
			return arr[arr.length/2];
		else
			return (arr[(arr.length/2)-1] + arr[arr.length/2])/2;
		
	}
	
	public static double findMode(double[] arr){
		double mode = -999999;
		int freq = 0;
		int highestFreq = 1;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++){
			if (arr[i] == arr[i-1])
				freq++;
			else
				freq = 1;
			if (freq > highestFreq){
				highestFreq = freq;
				mode = arr[i];
			}			
		}
		
		return mode;
	}
	
	public static void main(String[] args) {
		double[] testArray = {-10,34.5,7.6,20.4,3.1,44,1,5,7,9};
		double[] tempArr = new double[testArray.length];
		for (int i = 0; i < testArray.length; i++){
			tempArr[i] = testArray[i];
		}
	    double mode = findMode(tempArr);
	    System.out.print("testArray = {");
	    for (int i =0 ; i < testArray.length; i++){
	    	System.out.print(testArray[i]);
	    	if (i != testArray.length-1)
	    		System.out.print(", ");
	    }
	    System.out.println("}");
	    if (mode != -999999)
	    	System.out.print("The mode for all of the elements in this array is "+mode);
	    else
	    	System.out.println("There is no mode!!!!!");
	    System.out.println("The median for all of the elements in this array is "+ findMedian(tempArr));
	    System.out.println("The mean for all of the elements in this array is "+ findMean(tempArr));
	}

}
