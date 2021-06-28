import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class App {

	private static BaseCustomerManager customerManager;

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Aslýnaz", "Atabay", 16072000, "1234567890"));

	}

}