package br.com.caelum.estoque.ws;

import java.io.Serializable;

public class ItemEstoque implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private Integer qtd;
	
	public ItemEstoque() {
		super();
	}
	
	
	public ItemEstoque(String codigo, Integer qtd) {
		super();
		this.codigo = codigo;
		this.qtd = qtd;
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	

}
