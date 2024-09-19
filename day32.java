🌟 Learning Journey - Day 32 🌟

Today, I focused on exploring the following concepts in Java:

What is a class, and how does it differ from an interface?
Can a class implement multiple interfaces? Why or why not?
What are the key differences between method declarations in a class and in an interface?
Can an interface have instance variables? Explain your answer.
How do access modifiers (like public, private, etc.) differ between classes and interfaces?
Can a class extend multiple classes? How does this differ from implementing interfaces?
What is the purpose of a default method in an interface, and how is it different from methods in a class?
When would you use an abstract class instead of an interface?
Can an interface extend another interface? If yes, what happens to the methods in the extended interface?
What is the difference between creating an object of a class and using an interface as a reference?
#Java #LearningJourney #Programming #ObjectOrientedProgramming

#java code 
for multiple interfaces
  public interface BuscuitInterface{
    public void sugar();
    
    public void dough();
}
public interface ChocolateInterface{
    public void taste();
    
    public void quality();
}

public class SweetClass implements BuscuitInterface ,ChocolateInterface
{
    public void sugar(){
        System.out.println("sugar is good");
    }
    public void dough(){
        System.out.println("dough is good");
    }
    public void taste(){
        System.out.println("for both taste is good");
    }
    public void quality(){
        System.out.println("quality also good");
    }
    
}
public class Main{
    public static void main(String[] args){
        SweetClass st=new SweetClass();
        st.sugar();
        st.dough();
        st.taste();
        st.quality();
    }
}
