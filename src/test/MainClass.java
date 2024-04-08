package test;

public class MainClass {
	public static void main(String[] args) {
		CheeseBurgerStore cbs = new CheeseBurgerStore();
		String out = cbs.createBurger().getName();
		System.out.print(out);
	
	}
}
