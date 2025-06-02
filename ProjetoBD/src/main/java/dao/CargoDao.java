package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnection;
import model.CargoModel;

public class CargoDao {
	
	private Connection connection;
	
	public CargoDao() {
		connection = SingleConnection.getConnection();
	}
	
	
	public void salvar(CargoModel model) {
		String sql = "insert into cargo(nomeCargo) values(?)";
		
		try {
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, model.getNomeCargo());
			insert.execute();
			connection.commit();
			
			System.out.println("Salvou as informaões no banco");
		} catch (Exception e) {
			try {
				System.out.println("Alterações revertidas no banco");
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Não salvou as informaões no banco");
			e.printStackTrace();
		}
	}
	
	public List<CargoModel> listarTodos(){
		List<CargoModel> list = new ArrayList<>();
		
		String sql = "select * from cargo";
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while(resultado.next()) {
				CargoModel model = new CargoModel();
				model.setIdCargo(resultado.getLong("idCargo"));
				model.setNomeCargo(resultado.getString("nomeCargo"));
				
				list.add(model);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public CargoModel listarPorId(Long id){
		CargoModel model = new CargoModel();
		
		String sql = "select * from cargo where id = " + id;
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			
			while(resultado.next()) {
				model.setIdCargo(resultado.getLong("idCargo"));
				model.setNomeCargo(resultado.getString("nomeCargo"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return model;
	}
	
	public void deletar(Long id) {
		String sql = "delete from cargo where id = " + id;
		
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			connection.commit();
			
			System.out.println("Deletado com sucesso");
		} catch (Exception e) {
			try {
				System.out.println("Alterações revertidas no banco");
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Não foi possivel deletar");
			e.printStackTrace();
		}
	}

}
