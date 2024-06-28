//array elemements taking subarray of 3 and returning sum in new array


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];//1 2 3 4 5
		int b[]=new int[n-2];//6 9 12
		int resultIndex=0;
		int len=b.length;
		int sum=0;
		int k;
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		
		for(int j=0;j<n-2;j++)
		{
		       System.out.println(a[j]+" "+a[j+1]+" "+a[j+2]);
		       sum=a[j]+a[j+1]+a[j+2];
		       System.out.println(sum);
		      b[resultIndex]=sum;
		      resultIndex++;
		      
		    } 
		    for( k=0;k<n-2;k++)
		    {
		        System.out.print(b[k]+" ");
		        
		    }
		    
		    
		    
		}  
	}

