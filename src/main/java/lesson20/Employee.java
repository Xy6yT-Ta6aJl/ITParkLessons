package lesson20;


public class Employee {

    private int id;

    private String name;
    private String login;
    private Positon positon;
    private Departament departament;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Positon getPositon() {
		return positon;
	}
	public void setPositon(Positon positon) {
		this.positon = positon;
	}
	public Departament getDepartament() {
		return departament;
	}
	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
    
}
