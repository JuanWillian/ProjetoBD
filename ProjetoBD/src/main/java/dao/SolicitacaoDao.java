package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.SingleConnection;
import model.SolicitacaoModel;

public class SolicitacaoDao {
	private Connection connection;

	public SolicitacaoDao() {
		connection = SingleConnection.getConnection();
	}

	public void insert(SolicitacaoModel solicitacao) {
		String sql = "INSERT INTO solicitacao VALUES (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, solicitacao.getIdUsuarioFk());
			ps.setLong(2, solicitacao.getIdEspacoFK());
			ps.setString(3, solicitacao.getStatus());
			ps.setString(4, solicitacao.getDataSolicitacao());
			ps.setString(5, solicitacao.getDataReserva());
			ps.setString(6, solicitacao.getHorarioInicio());
			ps.setString(7, solicitacao.getHorarioFim());
			ps.execute();
			connection.commit();
			System.out.println("As informações foram salvas");

		} catch (Exception e) {
			try {
				connection.rollback();
				System.out.println("Alterações revertidas no banco");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("As informações não foram salvas no banco");
			e.printStackTrace();
		}
	}

	public ArrayList<SolicitacaoModel> listarTodos() {
		ArrayList<SolicitacaoModel> list = new ArrayList<SolicitacaoModel>();
		String sql = "SELECT * FROM solicitacao";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SolicitacaoModel solicitacao = new SolicitacaoModel();
				solicitacao.setIdUsuarioFk(rs.getLong("idUsuarioFK"));
				solicitacao.setIdEspacoFK(rs.getLong("idEspacoFK"));
				solicitacao.setStatus(rs.getString("status"));
				solicitacao.setDataSolicitacao(rs.getString("dataSolicitacao"));
				solicitacao.setDataReserva(rs.getString("dataReserva"));
				solicitacao.setHorarioInicio(rs.getString("horarioInicio"));
				solicitacao.setHorarioFim(rs.getString("horarioFim"));
				list.add(solicitacao);
			}
		} catch (Exception e) {
			try {
				connection.rollback();
				System.out.println("Alterações revertidas no banco");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println("As informações não foram salvas no banco");
			e.printStackTrace();
		}
		return list;

	}

	public SolicitacaoModel listarPorId(Long idSolicitacao) {
		SolicitacaoModel solicitacao = new SolicitacaoModel();
		String sql = "SELECT * FROM solicitacao WHERE idSolicitacao = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, idSolicitacao);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				solicitacao.setIdUsuarioFk(rs.getLong("idUsuarioFK"));
				solicitacao.setIdEspacoFK(rs.getLong("idEspacoFK"));
				solicitacao.setStatus(rs.getString("status"));
				solicitacao.setDataSolicitacao(rs.getString("dataSolicitacao"));
				solicitacao.setDataReserva(rs.getString("dataReserva"));
				solicitacao.setHorarioInicio(rs.getString("horarioInicio"));
				solicitacao.setHorarioFim(rs.getString("horarioFim"));
			}
		} catch (Exception e) {
			try {
				connection.rollback();
				System.out.println("Alterações revertidas no banco");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println("As informações não foram salvas no banco");
			e.printStackTrace();
		}

		return solicitacao;
	}

	public void delete(Long idSolicitacao) {
		String sql = "DELETE FROM solicitacao WHERE idSolicitacao = ?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.execute();
			connection.commit();

			System.out.println("Usuario com o id" + idSolicitacao + "Deletado com sucesso");

		} catch (Exception e) {
			try {
				connection.rollback();
				System.out.println("Alterações revertidas no banco");
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println("As informações não foram salvas no banco");
			e.printStackTrace();
		}
	}

}
