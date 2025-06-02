package model;

public class UsuarioModel {
	private int idUsuario;
	private int idCargoFK;
	private String nomeUsuario;
	
	public UsuarioModel(int idUsuario, int idCargoFK, String nomeUsuario) {
		this.idUsuario = idUsuario;
		this.idCargoFK = idCargoFK;
		this.nomeUsuario = nomeUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdCargoFK() {
		return idCargoFK;
	}

	public void setIdCargoFK(int idCargoFK) {
		this.idCargoFK = idCargoFK;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
}
