package practicas;


@SerializeJson (path = "capitals.json")
public class Capital {

	@JsonElement(key = "Country")
	private String country;
	
	@JsonElement
	private String capital;
	
	public Capital (String country, String capital) {
		this.capital = capital;
		this.country = country;	
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}
