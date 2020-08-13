public abstract class Employee{
	private int empId;
	private String name;
	private double taxRate;

	public Employee(){
		setempId(456);
		setname("hamza");
		settaxRate(3.1);
	}
	public Employee(int empId,String name,double taxRate){
		this.empId= empId;
		this.name= name;
		this.taxRate= taxRate;
	}
	public void setempId(int empId){
		this.empId= empId;
	}
	public void setname(String name){
		this.name= name;
	}
	public void settaxRate(double taxRate){
		this.taxRate= taxRate;
	}
	public int getempId(){
		return empId;
	}
	public String getname(){
		return name;
	}
	public double gettaxRate(){
		return taxRate;
	}
	public abstract double calculateSalary();
	
	public String toString(){
		return ("Employee id= " + empId + "\n"+
		"Employee name+ " + name + "\n"+
		"taxRate= " + taxRate + "");
	}



}