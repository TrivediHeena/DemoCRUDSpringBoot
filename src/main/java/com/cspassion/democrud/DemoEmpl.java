package com.cspassion.democrud;

public class DemoEmpl {

	private int id;
	private String nm;
	private long salary;
	private long bonus;
	private long total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getBonus() {
		return bonus;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public DemoEmpl(int id, String nm, long salary, long bonus, long total) {
		super();
		this.id = id;
		this.nm = nm;
		this.salary = salary;
		this.bonus = bonus;
		this.total = total;
	}
	public DemoEmpl(String nm, long salary, long bonus, long total) {
		super();
		this.nm = nm;
		this.salary = salary;
		this.bonus = bonus;
		this.total = total;
	}
	public DemoEmpl(int id, String nm, long salary, long bonus) {
		super();
		this.id = id;
		this.nm = nm;
		this.salary = salary;
		this.bonus = bonus;
	}
	public DemoEmpl() {
		super();
	}
	
	
}
