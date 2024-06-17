//calculating the sum of given digits in a given integer

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // String str=Integer.toString(n);
        // int len=str.length();
        int sum=0,addition=0;
        // for(int i=0;i<len;i++)
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;//reversing number
            n=n/10;
            addition=addition+r;
            System.out.print(n+" ");
        }
        System.out.println(addition);
    }
}
