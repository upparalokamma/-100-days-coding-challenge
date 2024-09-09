1.hello world
public class Main{
public static void main(String[] args){
System.out.println("hello world");
}
}
2.Sum of Two Numbers
Write a Java program to take two integers as input and print their sum.
public class Main{
    public static void main(String[] args){
        int a=5;
        int b=3;
        int c;
        c=a+b;
        System.out.println(c);
  }
}

3.Check Even or Odd
Write a Java program to check if a given number is even or odd.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
4.Factorial of a Number
Write a Java program to find the factorial of a number using recursion.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" ");
        System.out.print(fib2+" ");
        if(n==0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(1);
        }
        
        else{
            for(int i=0;i<n;i++){
                
            
            int fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            
            System.out.print(fib3+" ");
            }
        }
    }
}
