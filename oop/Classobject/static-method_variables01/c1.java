// 53:-->18/5/2023
//


class Employee{

	int empId = 10;
	String empName = "kanha";

	void empInfo(){
	
		System.out.println("ID:"+empId);
		System.out.println("Name:"+empName);
	}


}

class user{

	public static void main(String[] boss){
	
		Employee emp = new Employee();
		
		emp.empInfo();
	//	Employee.empInfo();	
// if we create empInfo method static then we will call them by using class name where that method is present
//for that we have to accesses that valible make static or create an object
	
	}


}
