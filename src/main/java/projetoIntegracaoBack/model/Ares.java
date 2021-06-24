package projetoIntegracaoBack.model;

public enum Ares {
	ARES("ARES"),
	ARESTB("Ares TB"), 
	ARESTB7021("Ares 7021"), ARESTB7031("Ares 7031"), ARESTB7023("Ares 7023"),
	ARESTHS("ARES THS"), 
	ARESTHS8023_15("Ares 8023 15"), ARESTHS8023_200("Ares 8023 200"), ARESTHS8023_25("Ares 8023 2,5");

	private final String valor;
	
	Ares(String valorOpcao) {
		valor = valorOpcao;
	} 
	
	public String getValor() {
		return valor;
	}
}
