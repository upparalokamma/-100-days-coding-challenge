//Counting the factors of a given number

public class Solution {
    public int solve(int n) {
         
		int count=0;
		for(int i=1;i<=Math.sqrt(n);i++)
		{
		    if(n%i==0)
		    {
		        if(i==n/i)
		        {
		        count+=1;
		        }
		        else{
		            count+=2;
		        }
		    }
		    
		}
		return count;
    }
}
