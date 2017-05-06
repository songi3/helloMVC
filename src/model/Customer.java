package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //持失切 切疑持失

public class Customer {

	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
	
}
