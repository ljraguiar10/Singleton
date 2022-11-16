package designpatterns;

public class Singleton_3 {

	public static void main(String[] args) {

	}
}

//--------------------------------------------

class ConfiguraçãoAplicação {

	private static ConfiguraçãoAplicação instance;

	public String nomeAplicação;
	public String versão;
	public String cor;

	protected ConfiguraçãoAplicação() {
		this.nomeAplicação = "Singleton";
		this.versão = "3.0";
		this.cor = "Azul";
	}

	public ConfiguraçãoAplicação getInstance() {
		if (instance == null) {
			String configuração = System.getProperty("class.configuração");
			if (configuração == "teste") {
				instance = new ConfiguraçãoAplicaçãoTeste();
			}
			instance = new ConfiguraçãoAplicação();
		}
		return instance;
	}
}
//-------------------------------------------------

class ConfiguraçãoAplicaçãoTeste extends ConfiguraçãoAplicação {

	protected ConfiguraçãoAplicaçãoTeste() {
		this.nomeAplicação = "Singleton Teste";
		this.versão = "3.0";
		this.cor = "Vermelho";
	}

}