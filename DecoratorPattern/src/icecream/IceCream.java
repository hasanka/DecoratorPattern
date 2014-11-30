package icecream;

public abstract class IceCream {
	protected String description = "Unknown Ice Cream";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
