import java.util.Scanner;

//This class takes input size and the integers from user and prints the largest difference of the numbers
class largestDiff{
	static int findLargestDiff(int arr[], int len)
    	{
        	int largestDiff = -1, largestBack = arr[len-1];
        	if(len<2) {
            		largestDiff = 0;
            		return largestDiff;
        	}

        	for (int i = len-2; i >= 0; i--)
        	{
            		if (arr[i] > largestBack)
                		largestBack = arr[i];
            		else
            		{
                		int diff = largestBack - arr[i];
                		if (diff > largestDiff)
                		{
                   			 largestDiff = diff;
                		}
            		}
        	}
        	return largestDiff;
    	}

    	public static void main (String[] args) {
        	System.out.println ("Enter the total amount of numbers to be tested");
        	Scanner scanner = new Scanner(System.in);
        	int size = scanner.nextInt() , i = 0;

        	System.out.println ("Enter the numbers to be tested");
        	int arr[] = new int[size];
        	while (i<size){
            		arr[i] = scanner.nextInt();
            		i++;
        	}
        	System.out.println ("Largest difference is " + findLargestDiff(arr, size));
    	}
}
