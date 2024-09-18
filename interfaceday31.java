#interfacecode
  public interface Laptopinterface{
    public void copy();
    
    public void paste();

    public void cut();

    public void keyboard();

    public  default void security(){
        commonCode();
       System.out.println("please implement this");
    }
    public static void Quality(){
        commonCode();
       System.out.println("Quality code");
    }
    private static void commonCode(){
        System.out.println("commoncode");
    }

}
#lenovo class code
  public class Lenovo implements Laptopinterface
{
    public void copy()
    {
        System.out.println("Lenovo copy code");
    }
    public void paste()
    {
              System.out.println("lenovo paste code");
        }

    public void cut()
    {
              System.out.println("lenovo copy code");
    }

    public void keyboard()
    {
        System.out.println("lenovo keyboard code");

    }
    public void memory(){
        System.out.println("Lenovo memory code");

    }
    @Override
    public void security(){
        System.out.println("lenovo security code>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    public void Quality(){
        System.out.println("Lenovo quality code");
    }
}



#hp classcode
  public class Hp implements Laptopinterface
{
    public void copy()
    {
        System.out.println("HP copy code");
    }
    public void paste(){
              System.out.println("HP paste code");
        }

    public void cut(){
              System.out.println("HP copy code");
    }

    public void keyboard(){
        System.out.println("HP keyboard code");


    }
    public void camera(){
        System.out.println("hp camera code");

    }
    @Override
    public void security(){
        System.out.println("hp security code>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>..");
    }
    public void Quality(){
        System.out.println("Hp quality code");
    }
}

#user- main method 
  public class User{
    public static void main(String[] args){
        Lenovo lenovo=new Lenovo();
        lenovo.copy();
        lenovo.cut();
        lenovo.paste();
        lenovo.memory();
        lenovo.security();
        Laptopinterface.Quality();//accessing with classname means interface name directly becozz we declare a method with static keyword so

        Hp HP=new Hp();
        HP.copy();
        HP.paste();
        HP.keyboard();
        HP.camera();
        HP.security();
        Laptopinterface.Quality();//accessing with classname means interface name directly becozz we declare a method with static keyword so
        

    }
}



