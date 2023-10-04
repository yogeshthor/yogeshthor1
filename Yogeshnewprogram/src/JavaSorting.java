import java.util.Arrays;

public class JavaSorting {
	public static void main(String[] args) {
		int a[] = {12,4,2,16,20,15,55,32};
		int temp;
//		for(int i = 0; i< a.length; i ++)
//		{
//			for(int j =0; j< a.length; j++)
//			{
//				if(a[i] <  a[j])
//				{
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		
	 Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
	}

}
