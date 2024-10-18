package view;

import model.SerVivo;

public class MainVivo {
	/*
	Classe SerVivo:
Crie uma classe SerVivo com os atributos nome e idade. 
Implemente métodos para definir e obter os valores dos atributos.

*/
public static void main(String[] args) {
	
	SerVivo sv = new SerVivo();
	
	sv.setNome("Gabriel");
	sv.setIdade(20);
	
	System.out.println(sv.getIdade() +"\n"+ sv.getNome());
	
	}
}
