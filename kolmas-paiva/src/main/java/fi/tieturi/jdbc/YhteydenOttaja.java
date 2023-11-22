package fi.tieturi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class YhteydenOttaja {

	private static void lataaAjuri() throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		System.out.println("Ajuri ladattu");
	}
	
	public static void main(String[]args) {
		try {
			lataaAjuri();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/world", "postgres", "adminadmin")) {
			System.out.println("Connection saatu");
			ekaHaku(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static List<Country> ekaHaku(Connection con) throws SQLException {
		List<Country> maat = new ArrayList<>();
		String sql = "select * from country where name like 'F%'";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Country maa = new Country(rs);
				System.out.println(maa);
				maat.add(maa);
			}
		}
		return maat;
	}
}

class Country {
	private String name;
	private String code;
	private String continent;
	private long population;
	
	Country (ResultSet rs) throws SQLException {
		name = rs.getString("name");
		code = rs.getString("code");
		continent = rs.getString("continent");
		population = rs.getInt("population");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", continent=" + continent + ", population=" + population
				+ "]";
	}
	
}
