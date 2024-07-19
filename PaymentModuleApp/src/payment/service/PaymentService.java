package payment.service;

import user.service.User;

public class PaymentService {

	public static void main(String[] args) {


		User user = new User("javeed","javeed123");
		
		System.out.println("Welcome "+user.getUsername());
		
		System.out.println("This is Payment module , complete your payment");
		

	}

}
