package ex1_overriding;

public class PartTimeEmployee extends Employee {
	int hourPay;
	int workHours;
	
    public PartTimeEmployee(String name, int hourPay, int workHours) {
        super(name);
        this.hourPay = hourPay;
        this.workHours = workHours;
    }

    @Override
    public int getPay() {
        return hourPay * workHours;
    }
}
