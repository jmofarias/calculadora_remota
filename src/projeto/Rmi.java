package projeto;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Rmi extends UnicastRemoteObject implements Calculadora{
	public Rmi() throws RemoteException {
		int a,b;
	}
	public int add(int a, int b) throws RemoteException {
		return a + b;
	}
	public int sub(int a, int b) throws RemoteException {
		return a - b;
	}
	public int mul(int a, int b) throws RemoteException {
		return a * b;
	}
	public int div(int a, int b) throws RemoteException {
		return a / b;
	}

}
