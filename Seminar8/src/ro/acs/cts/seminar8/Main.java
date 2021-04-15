package ro.acs.cts.seminar8;

import ro.acs.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		
		OrderFacade facade = new OrderFacade();
		facade.order();
		
	}

}
