package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRMI {

	private Map<String, ItemEstoque> repo;
	
	public EstoqueService() throws RemoteException {
		super();
		repo = new HashMap<>();
		repo.put("SOA", new ItemEstoque("SOA",2));
		repo.put("ARQ", new ItemEstoque("ARQ",3));
		repo.put("TDD", new ItemEstoque("TDD",4));
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ItemEstoque getItemEstoque(String codProduto) throws RemoteException {
		
		return repo.get(codProduto);
	}

}
