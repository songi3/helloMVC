package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;

	private static final CustomerService instance = new CustomerService();
	
	private CustomerService() {
		customers = new HashMap<String, Customer>();
	}
	
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id){
		if(id!=null)
			return (customers.get(id.toLowerCase()));
		else
			return null;
	}
	
	public Customer login(String id,String password){
		Customer customer = findCustomer(id);
		if(customer!=null)//id 가 존재할때 
		{
			if(customer.getPassword().equals(password)){ //입력한 id와 패스워드가 동일할 때 //로그인 성공
				return customer;
			}
			else //비밀번호가 다를떄 //로그인 실패
				return null;
		}
		else //id 존재하지 않을떄
			return null;
	}
	
}
