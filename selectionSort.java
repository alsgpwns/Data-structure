package Test;

public class selectionSort {

	public static void main(String[] args) {
		int arr[]= {0,4,2,7,1,3,8,100,48};
		int[] result = selectionSort(arr);
		for(int i: result)
		{
			System.out.print(i+" ");
		}
	}
	


	public static int[] selectionSort(int arr[])
	{
		int min;
		int temp = 0;
		
		for(int i=0;i<=arr.length-1;i++) 
		{
			min=arr[i];
			for(int j=i;j<=arr.length-1;j++)
			{
				if(min>arr[j]) 
				{
					temp = min;
					min = arr[j];
					arr[j] = temp;
					arr[i] = min;
				}
			}
		}
		return arr;
	}
}
