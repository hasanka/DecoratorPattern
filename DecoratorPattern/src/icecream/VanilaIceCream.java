package icecream;

public class VanilaIceCream extends IceCream {

	public VanilaIceCream(){
		this.description = "Vanila Ice Cream ";
	}
	
	@Override
	public double cost() {
		return 55.5;
	}

}
