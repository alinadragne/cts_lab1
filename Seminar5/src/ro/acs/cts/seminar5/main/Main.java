package ro.acs.cts.seminar5.main;

import java.util.Scanner;

import ro.ase.cts.seminar5.factory.AbstractProductFactory;
import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.ProductFactory;
import ro.ase.cts.seminar5.factory.TechProduct;
import ro.ase.cts.seminar5.factory.TechProductFactory;
import ro.ase.cts.seminar5.singleton.Cart;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse: \n tech - Produse tech \n office - Produse office");
		String userPreference = scan.nextLine();
		
		AbstractProductFactory productFactory = null;
		if(userPreference != null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}
		Product myProduct = null;
		
		
		myProduct = productFactory.makeProduct();
	
//		}
//		else {
//			System.out.println("Optiune invalida.");
//			System.out.println("Catalog produse: \n tech - Produse tech \n office - Produse office");
//		}
		if(myProduct != null) {
			myShoppingCart.products.add(myProduct);
		}
		
		for(Product p: myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}
