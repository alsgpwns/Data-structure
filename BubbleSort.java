package Test;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {7,4,5,1,3};
		int[] result = Bubble(arr);
		
		for(int i: result)
		{
			System.out.print(i);
		}
	
	}
	
	public static int[] Bubble(int arr[])
	{
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				else if(arr[j]==arr[j+1]) {
					continue;
				}
			}
			
		}
		
		
		return arr;
	}
}
