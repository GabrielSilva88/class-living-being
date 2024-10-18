package model;

public class Ave extends SerVivo{
	/*
	 Classe Ave:
	 Crie uma classe Ave que herda da classe SerVivo. 
	 Adicione um atributo tipoDeBico e um método para voar.
	 */

	// atributo
	private String tipoDeBico;
	
	//método para voar
	
	public String voar() {
		return getNome() + " pode voar, seu bico é " +getTipoDeBico();
	}
	
	public String getTipoDeBico() {
		return tipoDeBico;
	}

	public void setTipoDeBico(String tipoDeBico) {
		this.tipoDeBico = tipoDeBico;
		
	}
	
}
