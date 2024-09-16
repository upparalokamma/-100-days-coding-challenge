public class MutableStrings{
       public static void main(String[] args){
        String s1="raji";//address of s1 and s2 is same because it is having same data
        String s2="raji";
        System.out.println(s1==s2);//so it is giving true
        s1=s1+"uppara";//but after updating data adress will also change in immutable Strings
        System.out.println(s1==s2);
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        //here we are having different address "==" means comaparision of addresses not data
        //so here memory wastage is happening for that purpose and for String manipulation Stringbuffer and StringBuilder was introduced by java
        //why java introduced two mutable Strings ?
        //becoz Stringbuffer allows synchronisation whuch means (multi threading) one thread will execute another threads want to wait 
        //this process will happen until completion of threads 
        //so Stringbuffer having low performance for that purpose Stringbuilder came 
        //Stringbuilder single thread execution so it is having high performance
        ////////////////////////////////
        //both String builder and buffer exactly same but only difference is stringbuffer having synchronisation 
        StringBuffer sb1 = new StringBuffer("raji");
        StringBuffer sb2=new StringBuffer("raji");
        System.out.println(sb1==sb2);//false becoz memory will allocate in heap
        sb1=sb1.append("uppara");
        System.out.println(sb1==sb2);
        System.out.println(">>>>>>>>>>>.");
        //stringbuilder 
        StringBuilder sp1 = new StringBuilder("raji");
        StringBuilder sp2=new StringBuilder("raji");
        System.out.println(sp1==sp2);//false becoz memory will allocate in heap
        sp1=sp1.append("uppara");
        System.out.println(sp1==sp2);
        //methods
        StringBuilder tb=new StringBuilder("raji");
        //append()
        tb=tb.append("uppara");
        System.out.println("appended final string is:"+tb);
        //insert(index position,inserted stringname)
        tb=tb.insert(4,"Ramakrishna");
        System.out.println("inserted final string is:"+tb);
        //delete(start,end )
        tb=tb.delete(16,21);
        System.out.println("deleted after output is:"+tb);
        //replace(start,end,stringname)
        tb=tb.replace(4,10,"dhanamma");
        System.out.println("replced after final String is:"+tb);
        //reverse()
        tb=tb.reverse();
        System.out.println("reversed string is:"+tb);
        //capacity()//by default if in string builder if we didnt pass any data means by default the capacity is 16
        //if we pass any data means capacity is 16+no of characters 
        
        System.out.println("capacity of the string is:"+tb.capacity());
       }
}
