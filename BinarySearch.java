package Test;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = new int[20];
		int target=30;
		int result = BSearch(arr, target);
		System.out.println(result);
	}
	
	public static int BSearch(int arr[], int target) {
	    int low = 0;
	    int high = arr.length - 1;
	    int mid = 0;
	
	    while(low <= high) {
	        mid = (low + high) / 2;
	
	        if (arr[mid] == target)
	            return mid;
	        else if (arr[mid] > target)
	            high = mid - 1;
	        else
	            low = mid + 1;
	    	if(low>high)
			{
				mid=404;
				break;
			}
	    }
	    return mid;
	}
}

