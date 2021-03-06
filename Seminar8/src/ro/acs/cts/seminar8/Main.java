package ro.acs.cts.seminar8;

import ro.acs.cts.seminar8.composite.CatalogComponent;
import ro.acs.cts.seminar8.composite.Product;
import ro.acs.cts.seminar8.composite.ProductCatalog;
import ro.acs.cts.seminar8.decorator.AbstractBackpack;
import ro.acs.cts.seminar8.decorator.BackPack;
import ro.acs.cts.seminar8.decorator.WithFoodDecorator;
import ro.acs.cts.seminar8.decorator.WithLaptopDecorator;
import ro.acs.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		
		OrderFacade facade = new OrderFacade();
		facade.order();
		System.out.println("----------------------");
		
		CatalogComponent laptop = new Product("Asus",3500);
		CatalogComponent smartPhone = new Product("Samsung s20",3500);
		
		CatalogComponent techProductsCatalog = new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);
		
		CatalogComponent officeProductsCatalog = new ProductCatalog("Office products");
		CatalogComponent paperclip = new Product("Paperclip",5);
		CatalogComponent pen = new Product("Blue pen",2);
		officeProductsCatalog.add(pen);
		officeProductsCatalog.add(paperclip);
		
		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product",0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductsCatalog);
		
		
		System.out.println(genericProducts);
		
		System.out.println("----------------------");
		
		AbstractBackpack myBackpack = new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorator(new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();
		
	}

}
