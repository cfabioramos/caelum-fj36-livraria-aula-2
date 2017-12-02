package br.com.caelum.estoque.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.estoque.rmi.EstoqueRMI;
import br.com.caelum.estoque.rmi.ItemEstoque;

public class ClienteRMI {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		EstoqueRMI estoqueRMI = (EstoqueRMI) Naming.lookup("rmi://localhost:1099/estoque");
		ItemEstoque ie = estoqueRMI.getItemEstoque("ARQ");
		System.out.println(ie.getCodigo());
		ie.setCodigo("TESTE");
		System.out.println(ie.getCodigo());
	}
}
