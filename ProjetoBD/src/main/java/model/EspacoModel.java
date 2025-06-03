package model;

public class EspacoModel {
<<<<<<< HEAD
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

=======
    private Long IdEspaco;
    private String nomeEspaco;
    private String numeroEspaco;
    private Long tipoEspacoFk;
    private int metragem;

    public Long getIdEspaco() {
        return IdEspaco;
    }

    public void setIdEspaco(Long idEspaco) {
        this.IdEspaco = idEspaco;
    }

    public String getNomeEspaco() {
        return nomeEspaco;
    }

    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    public String getNumeroEspaco() {
        return numeroEspaco;
    }

    public void setNumeroEspaco(String numeroEspaco) {
        this.numeroEspaco = numeroEspaco;
    }

    public Long getTipoEspacoFk() {
        return tipoEspacoFk;
    }

    public void setTipoEspacoFk(Long tipoEspacoFk) {
        this.tipoEspacoFk = tipoEspacoFk;
    }

    public int getMetragem() {
        return metragem;
    }

    public void setMetragem(int metragem) {
        this.metragem = metragem;
    }
>>>>>>> 82d1caa13ad10237cf16d9e3a84812bd506cab54
}
