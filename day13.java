//second max in an array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int len=a.length;
		int firstmax=0;
		int secondmax=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<len;i++)
		{
		        if(a[i]>firstmax)
		        {
		           firstmax=a[i];
		        }
		    
		}
		System.out.println("firstmax is :"+firstmax);
		for(int k=0;k<n;k++)
		{
		    if(a[k]>secondmax)
		    {
		        if(firstmax!=a[k])
		        {
		            secondmax=a[k];
		        }
		    }
		    
		}
		System.out.println("secondmax is :"+secondmax);
}
}
