package test;

import java.util.ArrayList;

interface Burger {
	String name="";
	String bread="";
	String sauce=""; 
	ArrayList<String> topping = new ArrayList<String>();
	
	public void prepare();
	public void cook();
	public void serve();
	public String getName(); 

}
