class Test {
	public static String EmployeeName;//Static Variable
	public static final String EMPLOYEE_LAST_NAME = "Bhattar";//Decalring a constant
}
class ClassVariableORStatic{
	public static void main(String[] args){
	Test.EmployeeName = "Ajay Kumar";
	System.out.println("Employee Full Name is : "+Test.EMPLOYEE_LAST_NAME+" "+Test.EmployeeName);
	}
}
