package ftmk.rmi.sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensor extends Remote {
	
	/**
	 * This method gets current temperature
	 * 
	 * @return current temperature
	 * 
	 * @throws RemoteException
	 */
	public int getTemperature() throws RemoteException;

}
