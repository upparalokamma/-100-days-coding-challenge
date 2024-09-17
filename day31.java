#reverse a string using inbuilt method and normal method using for loop reverse

public class ReverseString{
    public static void main(String[] args){
       //immutable string
        String str="Ramakrishna";
       int len=str.length();
       String reverse="";
        for(int i=len-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
            
        }
        System.out.println(reverse);
        //mutable string
        StringBuilder sb=new StringBuilder("ramadhana");
        sb=sb.reverse();
        System.out.println(sb);

        

        }
    }
