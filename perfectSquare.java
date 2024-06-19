//find given number is perfect square or not

public class Solution {
    public int solve(int n) {
         int result=-1;
         for(int i=1;i<=n;i++)
         {
             if(i==n/i)
             {
                 result=i;
                 break;
                 
             }
             
         }
        
		return result;
         
    }

}
