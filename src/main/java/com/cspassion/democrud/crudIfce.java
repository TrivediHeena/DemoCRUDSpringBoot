package com.cspassion.democrud;

public interface crudIfce {

	public void save(DemoEmpl obj);
	public void deleteData(int id);
	public void updtData(DemoEmpl obj);
	public void selectData(int id);
	public void selectAll(DemoEmpl obj);
}
