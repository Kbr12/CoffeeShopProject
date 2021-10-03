package Concrete;

import java.rmi.RemoteException;


import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	// dependency injection
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws NumberFormatException, RemoteException  {

		if (customerCheckService.checkIfRealPerson(customer)) {

			super.save(customer);

		} else {

			System.out.println("not a valid person ");
		}

	}

}
