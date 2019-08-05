
public class Salary {
	
	private int hours;
	private double fee;
	
	public void salary() {
		hours = 0;
		fee = 0.0;
	}
	
	public Salary(int hours, double fee) {
		this.hours = hours;
		this.fee = fee;		
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public Double getFee() {
		return  fee;
	}
	
	public void setFee(Double fee) {
		this.fee = fee;		
	}
	
	public double total(int hours, double fee) {
		return this.hours * this.fee;
	}
	
	public void print() {
		System.out.println("Hours: " + hours + ", Fee: " + fee + " Total get " + total(hours, fee));
		
	}
	
}
