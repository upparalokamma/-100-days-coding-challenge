
import java.lang.*;
public class Multithread{
    public static void main(String[] args){
        System.out.println("hiiiiiiiiiiiiiiiiiii rajiiiiiiiiiiiiiiiii");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getId());
        System.out.println("priority is:"+Thread.currentThread().getPriority());
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
        Thread t4=new Thread();

        t1.start();//when we start the thread it is ready to run so there is no need to call run method again 
        t2.start();
        t3.start();
        t4.start();
        System.out.println(Thread.activeCount());
    }
}
class Employee extends Thread{
    @Override
    public void run(){

    }
}
