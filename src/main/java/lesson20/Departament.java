package lesson20;

public class Departament {

    private String city;
    private String subdivision;

    public Departament(String city, String subdivision) {
        this.city = city;
        this.subdivision = subdivision;
        
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}
}
