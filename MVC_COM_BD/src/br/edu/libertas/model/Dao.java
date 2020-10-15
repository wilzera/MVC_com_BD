package br.edu.libertas.model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import br.edu.libertas.db.Conexao;
import br.edu.libertas.dto.CityDto;

public class Dao {

	public LinkedList<CityDto> listCities() {
		
		Conexao conection = new Conexao();
		LinkedList<CityDto> list = new LinkedList<CityDto>();
		
		try {
			
			String sql = "SELECT * FROM city";
			
			Statement sta = conection.getConexao().createStatement();
			ResultSet res = sta.executeQuery(sql);
			
			while (res.next()) {
				
				CityDto city = new CityDto();
				city.setCityName(res.getString("cityName"));
				list.add(city);
				
			}
			
			res.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		conection.desconecta();
		
		return list;
}
	
}
