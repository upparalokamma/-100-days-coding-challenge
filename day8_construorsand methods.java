//constructors and methods

class Animal{
    String Animal_name;
    int age;
    public Animal(){
        Animal_name="kiran";
    }
    public  Animal(String name){
        Animal_name=name;
        
    }
    public Animal(String name,int ageofanimal){
        age=ageofanimal;
        Animal_name=name;
        
        
    }
    
    void bark(){
        System.out.println(Animal_name+" "+"is barking");
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		Animal an=new Animal();
		System.out.println(an.Animal_name);
		Animal an1=new Animal("dog");
			System.out.println(an1.Animal_name);
			Animal an2=new Animal("dog",3);
			System.out.println(an2.Animal_name+" "+an2.age);
		    an.bark();
		    an1.bark();
		    
		an2.bark();
		
	}
}
