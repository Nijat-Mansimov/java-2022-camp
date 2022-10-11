package exercises1.service;

public class DoctorCreditManager extends BaseCreditManager implements CreditManager{

	@Override
	public void calculate() {
		System.out.println("Doktor kredisi hesaplandi.");
		
	}

}
