package p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
		@Autowired
		private CustomerDAO customerDAO;
	
	@Transactional	
	@Override
	public List<Customer> getCustomers() {
		
	 return customerDAO.getCustomers();
	}

	@Transactional
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		 customerDAO.saveCustomer(theCustomer);
		
	}

	@Transactional
	@Override
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Transactional
	@Override
	public void deleteCustomer(int theId) {
		
		 customerDAO.deleteCustomer(theId);
		
	}

	@Transactional
	@Override
	public List<Customer> searchCustomers(String theSearchName) {
		
		return customerDAO.searchCustomers(theSearchName);
	}

}
