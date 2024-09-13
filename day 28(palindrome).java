#palindrome string


public class Main
{
	public static void main(String[] args) {
		String str="Radar";
		str=str.toLowerCase();
		int len=str.length();
		int start=0;
		int end=len-1;
		
		
	    while(str.charAt(start)==str.charAt(end)&&start<=end)
	    {
	       
	        start++;
	        end--;
	       
	    }
	    if(str.charAt(start)==str.charAt(end)) {
	    
		System.out.println("is palindrome");
	    }
	    else{
	        System.out.println("not palindrome");
	    }
		
	}
}


#palindrome number

public class Main
{
	public static void main(String[] args) {
		int n=122;
	     
		int sum=0,temp;
		temp=n;
		while(n>0){
		    int r=n%10;
		    sum=(sum*10)+r;
		    n=n/10;
		    
		}System.out.println(sum);
		if(temp==sum){
		    System.out.println("palindrome");
		    
		}
		else{
		    System.out.println("is not palindrome");
		    
		}
	}
}
#using inbuilt function
public class Main
{
	public static void main(String[] args) {
		String str="Radar";
		String reverse="";
		str=str.toLowerCase();
		int len=str.length();
		for(int i=len-1;i>=0;i--){
		     reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		if(str.equals(reverse)){
		    System.out.print("palindrome");
		}
		else{
		    System.out.println("not palindrome");
		}
	}
}




Question 8: Recursion
Write a recursive method to check if a string is a palindrome. For example, the string "radar" should return true, while "hello" should return false.
#without using boolean

public class Main
{
    public String palindrome(String str)
    {
        int len=str.length();
        str=str.toLowerCase();
        int start=0,end=len-1;
        while(str.charAt(start)==str.charAt(end)&&start<=end)
        {
            start++;
            end--;
        }
        if(str.charAt(start)==str.charAt(end))
        {
            System.out.println("palindrome");
            
        }
        else
        {
            System.out.println("is not palindrome");
        }
        return str;
    }
	public static void main(String[] args) 
	{
		Main rev=new Main();
		rev.palindrome("malayalam");
	}
}


#with boolean

public class Main
{
    public boolean palindrome(String str,int start,int end)
    {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        
        return palindrome(str,start+1,end-1);
        
    }
	public static void main(String[] args) 
	{
		Main rev=new Main();
		
        
        String input="Radar";
        input=input.toLowerCase();
		boolean result=rev.palindrome(input,0,input.length()-1);
		System.out.println(result);
		if(result==true){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println("not palindrome");
		}
		
	}
}


