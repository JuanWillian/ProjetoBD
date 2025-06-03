package model;

public class EspacoModel {
	private int idEspaco;
	private String nome;
	private String numero;
	private int idTipoEspacoFK;
	private Double metragem;

	public EspacoModel(int idEspaco, String nome, String numero, int idTipoEspacoFK, Double metragem) {
		this.idEspaco = idEspaco;
		this.nome = nome;
		this.numero = numero;
		this.idTipoEspacoFK = idTipoEspacoFK;
		this.metragem = metragem;
	}

	public int getIdEspaco() {
		return idEspaco;
	}

	public void setIdEspaco(int idEspaco) {
		this.idEspaco = idEspaco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getIdTipoEspacoFK() {
		return idTipoEspacoFK;
	}

	public void setIdTipoEspacoFK(int idTipoEspacoFK) {
		this.idTipoEspacoFK = idTipoEspacoFK;
	}

	public Double getMetragem() {
		return metragem;
	}

	public void setMetragem(Double metragem) {
		this.metragem = metragem;
	}


}
