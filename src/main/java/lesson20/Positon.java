package lesson20;

import java.math.BigDecimal;

public class Positon {

    private String positionName;
    private int salary;

    public Positon(String positionName, int salary) {
        this.positionName = positionName;
        this.salary = salary;
        
    }

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
