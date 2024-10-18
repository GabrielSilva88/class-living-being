package model;

public class Planta extends SerVivo {
/* Classe Planta:
Crie uma classe Planta que herda da classe SerVivo. 
Adicione um atributo tipo e um método para realizar a fotossíntese. */
	
	//atributo
	private String tipo;
	
	//método para realizar a fotossíntese
	
	public String fotossintese() {
		return "todas as plantas," +getTipo() + " faz fotosintese.";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
