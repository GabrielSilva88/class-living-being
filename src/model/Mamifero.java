package model;

public class Mamifero extends SerVivo{
/* 
 Classe Mamifero:
	Crie uma classe Mamifero que herda da classe SerVivo. 
	Adicione um atributo genero e um método para amamentar.
*/
	private String genero;
	
	//método para amamentar
	public String amamentar() {
		if(genero.equalsIgnoreCase("masculino")) {
		return "Mamiferos Masculino, não amamentar.";
		}else {
			return "Mamiferos Feminino, pode amamentar";
		}
	}
	
	// metodos modificadores atributo.
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
