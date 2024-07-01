//sort an array first half of array in ascending order second half in descending order
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int len=a.length;
		int temp;
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]>a[j])
		        {
		            temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		        
		    }
		    
		    }
		    for(int r=0;r<=len/2;r++)
		    {
		        System.out.print(a[r]+" ");
		    }
		    for(int p=len-1;p>len/2;p--)
		    {
		        System.out.print(a[p]+" ");
		    }
		  //  for(int k=0;k<n;k++){
		  //      System.out.print(a[k]+" ");
		        
		}
		
		
	}







//array max element
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int len=a.length;
		int max=a[0];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(int i=0;i<len;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[j]>a[0])
		        {
		            max=a[j];
		        }
		    }
		}
		System.out.println(max);
}
}
