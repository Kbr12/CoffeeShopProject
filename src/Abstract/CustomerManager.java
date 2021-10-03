package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class CustomerManager implements CustomerService{
	
	public void save(Customer customer) throws NumberFormatException, RemoteException{
		
		System.out.println("SAVED TO DB : "+customer.getFirstName()+" "+customer.getLastName());
		
	};

}
