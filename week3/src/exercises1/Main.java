package exercises1;

import exercises1.entities.CompanyCustomer;
import exercises1.entities.Customer;
import exercises1.service.CreditManager;
import exercises1.service.CustomerManager;
import exercises1.service.TeacherCreditManager;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1); //prints 20

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0] = 1000;
        System.out.println(sayilar1[0]); //prints 1000

        CreditManager creditManager = new TeacherCreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Ahmet";
        customer.lastName = "Yilmaz";
        customer.nationalID = "12345";
        customer.city = "Ankara";

        CompanyCustomer commercialCustomer = new CompanyCustomer();
        commercialCustomer.taxNumber = "555";
        commercialCustomer.companyName = "Arcelik";
        commercialCustomer.id = 100;

        CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();


        Customer[] array = new Customer[]{customer};
        for (Customer c: array) {
            System.out.println(c.id);
        }
	}

}
