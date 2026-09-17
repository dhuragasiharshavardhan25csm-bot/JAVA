//employee class used to get and display the employee details
class Employee{
	String name;
	int id;
	String des;
	double salary;
	String promotionstatus;
	
	//c1
	Employee(String n,int id){
		this.name=n;
		this.id=id;
		this.des="Employee";
		this.salary=0;
		this.promotionstatus="unable to promote";
	}
	
	//c2
	Employee(String n,int id,String des,double salary){
		this.name=n;
		this.id=id;
		this.des=des;
		this.salary=salary;;
		this.promotionstatus="pending...";
	}
	
	//c3
	Employee(String n,int id,String des,double salary,String promotion){
		this.name=n;
		this.id=id;
		this.des=des;
		this.salary=salary;;
		this.promotionstatus=promotion;
	}
	
	void display() {
		System.out.println("name of the employee:"+name);
		System.out.println("id of the employee:"+id);
		System.out.println("designation of the employee:"+des);
		System.out.println("salary of the employee:"+salary);
		System.out.println("promotion status:"+promotionstatus);

	}
}

//main

public class Week5 {
  public static void main(String[] args) {
	  System.out.println("employee list");
	  Employee e1=new Employee("raghu",10000);
	  Employee e2=new Employee("jassu",1001,"manager",70000);
	  Employee e3=new Employee("uday",1002,"ass manager",65000,"manager");
	  
	  e1.display();
	  System.out.println(" ");
	  e2.display();
	  System.out.println(" ");
	  e3.display();
  }
}
