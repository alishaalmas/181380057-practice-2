public class CommissionedEmployee extends Employee{
	
	private double sales;
	private double commissionRate;

	public CommissionedEmployee(){
		super();
		setsales(sales);
		setcommissionRate(commissionRate);
	}
	public CommissionedEmployee(int empId,String name,double taxRate,double sales,double commissionRate){
		super(empId,name,taxRate);
		setsales(sales);
		setcommissionRate(commissionRate);

	}
	public void setsales(double sales){
		this.sales=sales;
	}
	public void setcommissionRate(double commissionRate){
		this.commissionRate=commissionRate;
	}
		
	public double getsales(){
		return sales;
	}
	public double getcommissionRate(){
		return commissionRate;
	}
        public double calculateSalary(){
		double grosspay;
		double tax;
		double salary;
			grosspay = (sales * commissionRate);
			tax = (grosspay * gettaxRate());
			salary = grosspay - tax;
			return salary;
	
	}

	
                public String toString(){
		return super.toString()+ "\n"+
		 "sales= "+ sales +"\n"+ "commissionRate= "+ commissionRate+"";
	
	


        }