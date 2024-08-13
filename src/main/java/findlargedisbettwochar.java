
import java.util.*;
public class findlargedisbettwochar {
	public static int func(String str)
	{
		int k=0,s1=0,n=0;
	    char[]ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<str.length()-1;i++)
		{
		k=0;	
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					k++;
					n=k;
					if(n>=s1)
					{
					s1=n;
					n=0;
					}
				}
				else
				{
				k++;
				}
			}
		}
		return s1-1;
		
	}
	
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int fin=Integer.valueOf(func(str));

		System.out.println(fin);
		
	}

	

}
