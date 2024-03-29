package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckOfRealPerson(Customer customer)  {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(customer.getNationalityId(),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getBirthDate().getTime());
		

	}

}
