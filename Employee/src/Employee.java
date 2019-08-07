
public class Employee {
	private Employee boss;
	private String ID;
	private double total_bonus;
	
	public Employee(String ID) {
		this.ID = ID;
		this.boss = null;
		this.total_bonus = 0;
	}
	
	public Employee(String ID, Employee boss) {
		this.ID = ID;
		this.boss = boss;
		this.total_bonus = 0;
	}
	
	public void addBonus(double value) {
		this.total_bonus += value;
		double temp = value / 10;
		if (boss != null) {
			boss.addBonus(temp);
		}
	}
	
	public double getBonus() {
		return total_bonus;
	}
	
	public String toString() {
		return this.ID;
	}
	
}
