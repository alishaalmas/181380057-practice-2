public class HourlyEmployee extends Employee{
	
	private double hours;
	private double hourlyRate;

	public HourlyEmployee(){
		super();
		sethours(hours);
		sethourlyRate(hourlyRate);
	}
	public HourlyEmployee(int empId,String name,double taxRate,double hours,double hourlyRate){
		super(empId,name,taxRate);
		sethours(hours);
		sethourlyRate(hourlyRate);

	}
	public void sethours(double hours){
		this.hours=hours;
	}
	public void sethourlyRate(double hourlyRate){
		this.hourlyRate=hourlyRate;
	}
		
	public double gethours(){
		return hours;
	}
	public double gethourlyRate(){
		return hourlyRate;
	}
	public double calculateSalary(){
		double grosspay;
		double tax;
		double salary;
	
		 grosspay =( hours * hourlyRate);
				tax =( grosspay * gettaxRate());
				salary = grosspay - tax ;
				return salary;



		//return 0.0;
	}
	
	public String toString(){
		return super.toString()+"\n"+
		 "hours= "+ gethours() + "\n"+"hourlyRate= "+ gethourlyRate() +"";
	}



}