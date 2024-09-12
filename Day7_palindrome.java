//PALINDROME STRING



import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        // String str="MALAYALAM";
        int len=str.length();
        int start=0,end=len-1;
        
        // System.out.println(start+" "+end);
        //  System.out.println(str.charAt(start)+" "+str.charAt(end));
         
        //  for(;str.charAt(start)==str.charAt(end) && start<=end;)
        //  while(str.charAt(start)==str.charAt(end) && start<=end)
        {
        //   System.out.println(start+" "+end);
        //   System.out.println(str.charAt(start)+" "+str.charAt(end));
            start++;
            end--;
        // System.out.println(start+" "+end);
        // System.out.println(str.charAt(start)+" "+str.charAt(end));
        
        }
        
        if(str.charAt(start)==str.charAt(end))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
        //  System.out.println(start+" "+end);
        // System.out.println(str.charAt(start)+" "+str.charAt(end));
      
    }
}
//malayalam




//PALINDROME NUMBER


public class Main{
    public static void main(String[] args){
        int sum=0,temp;
        int n=141;
        temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }System.out.println(sum);
        
        if(temp==sum)
        {
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }
    }
}
