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
		if(customer!=null)//id �� �����Ҷ� 
		{
			if(customer.getPassword().equals(password)){ //�Է��� id�� �н����尡 ������ �� //�α��� ����
				return customer;
			}
			else //��й�ȣ�� �ٸ��� //�α��� ����
				return null;
		}
		else //id �������� ������
			return null;
	}
	
}
