public class SalariedEmployee extends Employee{
	
	private double salary;

	public SalariedEmployee(){
		super();
		setSalary(salary);
	}
	public SalariedEmployee(int empId,String name,double taxRate,double salary){
		super(empId,name,taxRate);
		setSalary(salary);

	}
	public void setSalary(double salary){
		this.salary= salary;
	}
		
	public double getSalary(){
		return salary;
	}
	public double calculateSalary(){
		return salary - (salary * gettaxRate());
	}
	
	public String toString(){
		return super.toString() + "\n"+
		 "salary= "+ salary + "";
	}



}