package coffeeShopProject;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.rmi.RemoteException;

import Abstract.CustomerManager;
import Adapters.MernisServisAdapter;
import Concrete.NeroCustomerManager;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		CustomerManager customerManager= new StarbucksCustomerManager(new MernisServisAdapter());
		customerManager.save(new Customer(1,"Kübra","ÇANAK",1994,"11222233355"));
		
	}

}
