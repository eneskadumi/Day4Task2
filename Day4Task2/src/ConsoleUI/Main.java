package ConsoleUI;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckService() {
			
			@Override
			public boolean CheckOfRealPerson(Customer customer) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		customerManager.save(new Customer(1, "Enes", "Kadumi", "12345678910", new Date(2001, 12, 21)));
		
	}

}
