package model;

public class EspacoModel {
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
}
