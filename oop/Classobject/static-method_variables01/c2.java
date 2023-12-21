class Employee{

	int empId =10 ;
	String name = "amar_Boss";

	static int y =100;

	void empInfo(){
		int in =1;
		String sureName =" thonge";
		System.out.println("Employee Id:" + empId);  //this is in bettween the that object or or block or only this empInfo scope 
		System.out.println("Employee name:" + name + sureName);

		System.out.println(Employee.y);
	
	
	}

}

class user {


	public static void main(String[] boss){
	
		Employee emp1 =new Employee();
		Employee emp2 =new Employee();

		emp1.empInfo();
		System.out.println("___________");
		System.out.println(emp1.y);
		emp1.y=1000;
		
		System.out.println(emp1.y);  //we cenging satic int usin emp1 
                System.out.println(emp2.y);  //but change ocur in emp2 object the resoin is y is satic 
					     //prisent in static block or this block present in method area not in emp1 or emp2
					     //


		//but in instant veraible present in construe of that class object
		//here two diffrent object the change occure in respt that single object or not shown in other object \
		//the  resiont is all new object is present in heap area 
		//

		emp2.empId=20;
		emp2.name="Tejas";

		//sopouse we accesses them whith other object then the change is not shown

		System.out.println("____________");
		System.out.println("emoId:"+emp1.empId);
		System.out.println("empName:"+emp1.name);
                
		//but we accessing using the emp1 that object using change is done then change is printing
		System.out.println("___________");
		System.out.println("empId:"+emp2.empId);
		System.out.println("empName:"+emp2.name);
		


	
	
	}

}
