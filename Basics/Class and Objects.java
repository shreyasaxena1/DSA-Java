public class Main
{
	public static void main(String[] args) {
	    
		Employee e1 = new Employee(45000.0f,"Ajeet",101);
		Employee e2 = new Employee(25000.0f,"Irfan",102);
		Employee e3 = new Employee(55000.0f,"Nakuul",103);
		
		
		e1.print_details();
		e2.print_details();
		e3.print_details();
	}
}
	
class Employee{
	    float salary;
	    String name;
	    int employee_id;
	    
	    //Constructor
	    public Employee(){
	        System.out.println("This is Employee class");
	    }
	    public Employee(float salary, String name, int employee_id){
	        this.salary = salary;
	        this.name = name;
	        this.employee_id = employee_id;
	    }
	    
	    public void print_details(){
	        System.out.println(name+" has Employee id: "+employee_id+" and Rs."+salary+" salary");
	    }
	    
 }
