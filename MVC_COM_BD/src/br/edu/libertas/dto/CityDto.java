package br.edu.libertas.dto;

public class CityDto {
	
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String toString() {
		return "Name city : " + this.getCityName();
	}

}
