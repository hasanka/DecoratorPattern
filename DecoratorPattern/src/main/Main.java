package main;

import decorators.CashewNutsTopping;
import decorators.GrapsTopping;
import decorators.StrawberryTopping;
import icecream.IceCream;
import icecream.MangoIceCream;
import icecream.VanilaIceCream;

public class Main {

	public static void main(String[] args) {
		IceCream iceCream1 = new MangoIceCream();
		iceCream1 = new StrawberryTopping(iceCream1);
		iceCream1 = new GrapsTopping(iceCream1);
		iceCream1 = new CashewNutsTopping(iceCream1);

		System.out
				.println("###################### MANGO ICE CREAM ########################");
		System.out.println(iceCream1.cost());
		System.out.println(iceCream1.getDescription());
		System.out
				.println("###############################################################");

		IceCream iceCream2 = new VanilaIceCream();
		iceCream2 = new StrawberryTopping(iceCream2);
		iceCream2 = new GrapsTopping(iceCream2);

		System.out
				.println("###################### VANILA ICE CREAM ########################");
		System.out.println(iceCream2.cost());
		System.out.println(iceCream2.getDescription());
		System.out
				.println("###############################################################");

	}

}
