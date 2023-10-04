import java.util.Arrays;

public class Stringnew{
		public static void main(String[] args) 
		{
			String sa[] = {"a","a","a","a","c","c","b","b","r","r","d","d","d","a","a"};
			
			Arrays.sort(sa);
			String lastcompare="" ;
			int count = 0;
			for ( int i=0; i<sa.length; i++)
			{						
				for (int j=0; j<sa.length; j++)
				{  
				if(sa[i] == sa[j] && sa[i] != lastcompare)
				{	
					count ++;
				}
				
			}
				lastcompare = sa[i];
				if(count > 0)
				System.out.println(lastcompare + "=" +count);
				count = 0;
			}
			
			
}
}