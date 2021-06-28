package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
		result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("TR")), customer.getLastName().toUpperCase(new Locale("TR")), customer.getDateOfBirth());
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
}
