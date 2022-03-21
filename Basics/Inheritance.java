//multiple inheritance - not supported in java

public class Main
{
	public static void main(String[] args) {
		Person p = new Person("Mayank",24);
		Doctor d = new Doctor("Shreya",21);
		
		p.show();
		d.show();
    }
}

class Person{
    String name;
    int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println(name+" is "+ age+" years old.");
    }
}

class Doctor extends Person{
    public Doctor(String name, int age){
        super(name,age);
    }
    
    void show(){
        System.out.println(name+" is a doctor and age is "+ age);
    }
}
