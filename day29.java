#String methods
import java.util.Arrays;

public class Stringmethods{
    public static void main(String[] args) {
        String s1="HELlo";
        String s2="hello";
        String s3=" raji uppara ";
        
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contains("he"));//capital so it gives an error
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.startsWith("HE"));
        System.out.println(s1.endsWith("He"));
        System.out.println((s1.endsWith("lo")));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s3.trim());//eliminate white spaces before and after a string
        System.out.println(s1.charAt(2));//return type int 
        System.out.println(s1.length());
        int r=10;
        String s=String.valueOf(r);//value of convert anydata type into String
        System.out.println(s);
        String str=s1.replace("HELlo","kavya");
        System.out.println(str);
        char[] a=s1.toCharArray();
        System.out.println(a);//but it printlike object we can see that array while debugging
        System.out.println(s1.indexOf("E"));
        System.out.println(s.indexOf("4"));//return -1 if character is not there text
        System.out.println(s3.lastIndexOf("a"));//returns index num where letter is last occured
        System.out.println(s3.substring(2,5));//if we didnt mention last index it will automaticallly take upto end
        String w ="hey guys what are you doing";
        System.out.println(w.split(" "));//[Ljava.lang.String;@6babf3bf it willl return this array
        //if we want to get array we want to use below method
        System.out.println(Arrays.toString(w.split(" ")));//output is this one [hey, guys, what, are, you, doing]
        System.out.println(w.charAt(9));
        System.out.println(w.replaceAll("hey guys","raji"));
        String t="";
        System.out.println(t.isBlank());//gives error becoz we didnt give anything if that string length is 0 means it will return true like given 
        System.out.println(t.isEmpty());
        String t1="  ";
        System.out.println("t1 is empty:"+" "+t1.isEmpty());//false becoz there is a spaces
        System.out.println("t1 is blank:"+" "+t1.isBlank());
        String r2="java is super";
        int count=r2.split(" ").length;
        System.out.println(count);
        
    }
}
