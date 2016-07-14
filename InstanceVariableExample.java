public class InstanceVariableExample {
	public String Name;//visible to everyone
	private double Salary;//visible to employee class only
	public InstanceVariableExample(String name){
		Name = name;
	}
	public void setSalary(double salary)
	{
		Salary = salary;
		
	}
	
	public void printEmployeeInfo(){
		System.out.println("Employee Name is :"+Name);
		System.out.println("Employee Salary is :"+Salary);
	}
	public static void main(String[] args)
	{
		InstanceVariableExample iv  =new InstanceVariableExample("Ajay");
		iv.setSalary(15000.04);
		iv.printEmployeeInfo();
	}
}
