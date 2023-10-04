package p1;

public class SortingLogic {
	
	public void Sort(int a[])
	{
		int temp = 0;
		for(int i = 0; i< a.length; i ++)
		{
			for(int j =0; j< a.length; j++)
			{
				if(a[i] <  a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
		
	}

}
