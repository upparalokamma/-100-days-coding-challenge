import java.util.*;
public class Ascii{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length()-1;
        int c=0;
        int decode=0;
        for(int i=len;i>=0;i--){
          char ch=str.charAt(i);
         // System.out.println((int)ch);
        decode=decode+((int)ch)*(int)(Math.pow(10,c));
        c++;
        System.out.println(decode);

        }
        //System.out.println(decode);
    }
}
