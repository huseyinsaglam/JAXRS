package _04.exceptionMapper;

import _03.exception.Customer;

public class CustomerService {

	public Customer findCustomer(int id) {
		
		if(id==1)
		{
			return new Customer(1, "bestCustomer");
		}
		return null;
	}

}
