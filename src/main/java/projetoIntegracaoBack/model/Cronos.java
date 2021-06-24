package projetoIntegracaoBack.model;

public enum Cronos {
	CRONOS("CRONOS"),
	CRONOSOLD("Cronos Old"),
	CRONOSOLD6001A("Cronos 6001-A"), CRONOSOLD6003("Cronos 6003"), CRONOSOLD7023("Cronos 7023"),
	CRONOSL("CRONOS L"),
	CRONOS6021L("Cronos 6021L"), CRONOSL6021("Cronos 6021L"), CRONOS7023L("Cronos 7023L"),
	CRONOSNG("Cronos-NG"),
	CRONOSNG6001("Cronos 6001-NG"), CRONOSNG6003("Cronos 6003-NG"), CRONOSNG6021("Cronos 6021-NG"),
	CRONOSNG6031("Cronos 6031-NG"), CRONOS7021NG("Cronos 7021-NG"), CRONOSNG7023("Cronos 7023-NG");
	
	private final String valor;
	
	Cronos(String valorOpcao){
		this.valor = valorOpcao;
	}
	
	public String getValor() {
		return valor;
	}
}
