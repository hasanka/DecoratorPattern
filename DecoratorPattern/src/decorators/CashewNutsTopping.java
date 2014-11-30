package decorators;

import icecream.IceCream;

public class CashewNutsTopping extends IceCreamDecorator {

	private IceCream iceCream;

	public CashewNutsTopping() {
	}

	public CashewNutsTopping(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription()+" + Cashew Nuts Topping";
	}

	@Override
	public double cost() {
		return iceCream.cost() + 20;
	}

}
