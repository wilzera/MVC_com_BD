package br.edu.libertas.model;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.libertas.db.Conexao;
import br.edu.libertas.dto.CityDto;

public class City {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			Dao dao = new Dao();
			LinkedList<CityDto> list = new LinkedList<CityDto>();
			String cityNames = "";
			
			list = dao.listCities();
			
			for (CityDto c : list) {
				cityNames += c.toString();
				cityNames += "<br/>";
			}
			
			request.setAttribute("city", cityNames);
			
			RequestDispatcher rd = request.getRequestDispatcher("city.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
