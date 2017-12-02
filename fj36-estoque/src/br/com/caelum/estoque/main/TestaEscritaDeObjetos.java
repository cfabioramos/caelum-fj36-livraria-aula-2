package br.com.caelum.estoque.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itens.bin"))){
			ItemEstoque i1 = new ItemEstoque("ARQ",2);
			ItemEstoque i2 = new ItemEstoque("SOA",3);
			List<ItemEstoque> lista = new ArrayList<ItemEstoque>();
			lista.add(i1);
			lista.add(i2);
			
			oos.writeObject(lista);
			
		}
	}
}
