/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Shape s = new Shape();
		s.show();
		Quadrilaterals q1 = new Quadrilaterals();
		
		q1.show();
		
		q1.area(5); //25
		q1.area(3,4); //12
	}
}

class Shape{
    
    void show(){
        System.out.println("This is Shape class");
    }
}

class Quadrilaterals extends Shape{
    
    void show(){ //Method overriding 
        System.out.println("This is Quadrilaterals class");
    }
    
    //Method Overloading
    void area(int side){ //square
        System.out.println(side*side); 
    }
    
    void area(int length,int width){ //rectangle
        System.out.println(length*width);
    }
}
