package Test;

public class InsertSort {
	public static void main(String[] args) {
		int arr[]= {9,5,7,1,2,50,14,40,88};
		int result[] = insertSort(arr);
		
		for(int i: result)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] insertSort(int arr[]) {
		int temp;
		
		for(int i=1;i<=arr.length-1;i++)
		{
			temp=arr[i];

			for(int j=i-1; j>=0; j--)
			{
				if(temp<arr[j])
				{	
					arr[j+1]=arr[j];	
					arr[j]=temp;
				}
				else if((temp>arr[j])&&(i==j+1))
				{
					arr[i]=temp;
					break;
				}
			}
		}
		
		
		
		return arr;
	}
}
