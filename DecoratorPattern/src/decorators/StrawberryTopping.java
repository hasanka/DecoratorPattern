package decorators;

import icecream.IceCream;

public class StrawberryTopping extends IceCreamDecorator {

	private IceCream iceCream;

	public StrawberryTopping() {
	}

	public StrawberryTopping(IceCream iceCream) {
		this();
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription() + "+ Strawberry Topping";
	}

	@Override
	public double cost() {
		return iceCream.cost() + 10;
	}

}
