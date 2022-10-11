package exercises1.service;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandi.");
		
	}

}
