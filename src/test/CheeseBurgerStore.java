package test;

public class CheeseBurgerStore implements BurgerStore{

	@Override
	public Burger createBurger() {
		// TODO Auto-generated method stub
		Burger b = new CheeseBurger();
		Burger c = new VeganBurger();
		return b;
	}

}
