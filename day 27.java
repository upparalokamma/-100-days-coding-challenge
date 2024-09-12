Question 1: Methods
Write a method that takes two integers as parameters and returns their sum. What will be the return value if both integers are negative?
public class Main
{
    public int add(int a,int b){
        return a+b;
    }
	public static void main(String[] args) {
	     Main addition=new Main();
	     int res1=addition.add(2,3);
	     int res2=addition.add(-3,-5);
	     System.out.println(res1);
	     System.out.println(res2);
	}
}
Question 2: Methods
Write a method that takes a string as input and returns its length. What happens if an empty string is passed as an argument?


public class Main
{
    public int string(String str){
        return str.length();
    } 
	public static void main(String[] args) {
	    Main raji=new Main();
	    int res=raji.string("java");
	    int res1=raji.string("");
		System.out.println(res);
		System.out.println(res1);
	}
}
Question 3: Methods
Explain method overloading in Java. Create two overloaded methods named divide that take either two integers or two doubles as parameters.


public class Main
{
    public int divide(int a,int b){
        return (a/b);
    }
    public double divide(double a,double b){
        return a+b;
    }
	public static void main(String[] args) {
		Main overload=new Main();
		int res1=overload.divide(10,5);
		double res2=overload.divide(17.1,12.2);
		System.out.println(res1);
		System.out.println(res2);
	}
}
Question 4: Methods
Write a void method that prints the multiplication table of a given integer up to 10. How would you call this method in the main program?

public class Main
{
    public int multiply(int n)
    {    
        int c=0;
        for(int i=1;i<=10;i++)
        {
            c=n*i;
            System.out.println(n+"*"+i+"="+c);
        }
        return c;
        
    }
	public static void main(String[] args) {
	    Main table=new Main();
	    table.multiply(2);
		
	}
}
Question 5: Recursion
Write a recursive method to calculate the factorial of a given number. Explain the base case and the recursive case.




public class Main
{
    public int fact(int n){
        if(n==0||n==1){
            return 1;
    }
    else{
        return n*fact(n-1);
    }
    }
	public static void main(String[] args) {
		Main m=new Main();
		int res=m.fact(6);
		System.out.println(res);
	}
}


Question 6: Recursion
Create a recursive method that takes an integer as input and returns the nth Fibonacci number. What is the time complexity of your solution?

public class Main
{
    
    public int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
	public static void main(String[] args) {
		Main m=new Main();
		int num=10;
		for(int i=0;i<=num;i++){
		    System.out.println("fibonacci of "+i+"is"+" "+m.fibonacci(i));
		}
 		
	}
}

Question 7: Recursion
Write a recursive method that takes an integer as input and returns the sum of its digits. For example, the input 456 should return 15.


public class Main{
    
    public int sumofDigit(int n ){
        int sum=0;
        for(int i=0;i<n;i++){
            int r=n%10;
           sum=sum+r;
           n=(int)(n/10);
        }
        return sum;
    }
    public static void main(String[] args){
        Main m=new Main();
        int res=m.sumofDigit(456);
        System.out.println(res);
        
    }
}



