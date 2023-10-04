import java.util.Arrays;

public class Count{
		public static void main(String[] args) 
		{
			int a[] = {2,2,2,4,6,4,8,10,10,15,13,13,17,18,17,100,102,100,108,100};
			
			Arrays.sort(a);
			int lastcompare = 0,count = 0;
			for (int i=0; i<a.length; i++)
			{						
				for (int j=0; j<a.length; j++)
				{  
				if(a[i] == a[j] && a[i] != lastcompare)
				{	
					count ++;
				}
				
			}
				lastcompare = a[i];
				if(count > 0)
				System.out.println(lastcompare + "=" +count);
				count = 0;
			}
			
			

}
}