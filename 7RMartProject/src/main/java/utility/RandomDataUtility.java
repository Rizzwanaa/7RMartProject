package utility;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	Faker faker=new Faker();
	
	public String createRandomUsername() {
		return faker.name().username();
	}
	
	public String createRandomPassword() {
		return faker.internet().password();
	}
	
	public String createRandomFullname() {
		return faker.name().fullName();
	}
	
	public String createRandomAddress() {
		return faker.address().fullAddress();
	}
}