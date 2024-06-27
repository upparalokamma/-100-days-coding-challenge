//exception handling
problem 1:
public class Main{
    public static void main(String[] args){
        int a=10;
        int b=0;
        int result=0;
        try{
         result=a/b;
        // System.out.println("result is"+result);
        }
        catch(Exception e ){
            System.out.println("executed");
            System.out.println("result is:"+result);
        }
    }
}

//problem 2:

public class Main{
    public static void main(String[] args){
        try{
            
        int a[]={1,2,3,4,5};
        System.out.println(a[10]);
        }
        catch(Exception e){
            System.out.println("executed");
        }
        
            
    }
}

