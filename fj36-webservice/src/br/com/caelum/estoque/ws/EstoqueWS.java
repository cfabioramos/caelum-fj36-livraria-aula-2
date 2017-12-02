package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;



@Stateless
@WebService(targetNamespace="http://caelum.com.br/estoque/v1")
public class EstoqueWS {
	
	private Map<String, ItemEstoque> repo;
	
	public EstoqueWS() {
		super();
		repo = new HashMap<>();
		repo.put("SOA", new ItemEstoque("SOA",2));
		repo.put("ARQ", new ItemEstoque("ARQ",3));
		repo.put("TDD", new ItemEstoque("TDD",4));
	}
	
	@WebMethod(operationName= "ItensPeloCodigo")
	@WebResult(name="itemEstoque")
	public List<ItemEstoque> getItemEstoque (
			@WebParam(name="codigo") List<String> listaCodigo,
			@WebParam(name="tokenUsuario", header= true) String token){
		
		if (token == null || !token.equals("TOKEN123")){
			throw new AutorizacaoException("Não autorizado.");
		}
		
		List<ItemEstoque> retorno = new ArrayList<>();
		for (String cd :listaCodigo) {
			ItemEstoque i = repo.get(cd);
			if(i != null)
				retorno.add(i);
		}
		return retorno;
	}

}
