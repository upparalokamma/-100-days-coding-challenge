//calculating prime number or not


public class Solution {
    public int solve(int n) {
        int count=0;
        
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(i==n/i)
                {
                    count++;
                }
                else
                {
                    count+=2;
                }

            }
        
        }
        if(count==2)
        {
            return 1;
        }
        else
        {
            return 0;

        }
        
    }
}
