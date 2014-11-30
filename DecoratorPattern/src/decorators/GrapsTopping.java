package decorators;

import icecream.IceCream;

public class GrapsTopping extends IceCreamDecorator {

	private IceCream iceCream;

	public GrapsTopping() {
	}

	public GrapsTopping(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return this.iceCream.getDescription() + "+ Graps Topping";
	}

	@Override
	public double cost() {
		return this.iceCream.cost() + 30;
	}

}
