package view;

import model.Mamifero;

public class MainMamifero{
	/* 
	 Classe Mamifero:
		Crie uma classe Mamifero que herda da classe SerVivo. 
		Adicione um atributo genero e um método para amamentar.
	*/
	public static void main(String[] args) {
		Mamifero mf = new Mamifero();
		
		mf.setGenero("Masculino");
		mf.setNome("Miguel");
		mf.setIdade(36);
	
		System.out.println("Todo ser vivo possui: ");
		System.out.println("sexo: "+ mf.getGenero() + "\nNome: "+ mf.getNome()+"\nIdade: "+ mf.getIdade());
		System.out.println(mf.amamentar());
		
		mf.setGenero("Feminino");
		mf.setNome("Elly");
		mf.setIdade(38);
		
		System.out.println("Todo ser vivo possui: ");
		System.out.println("sexo: "+ mf.getGenero() + "\nNome: "+ mf.getNome()+"\nIdade: "+ mf.getIdade());
		System.out.println(mf.amamentar());
	}
}
