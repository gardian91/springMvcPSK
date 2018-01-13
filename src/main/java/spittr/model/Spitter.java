package spittr.model;

public class Spitter {

    private Long id; 
	private String login;
	private String tittle;
	private String firstName;
	private String lastName;
	
	
	
	
	public Spitter(String login, String tittle, String firstName, String lastName) {
		super();
		this.login = login;
		this.tittle = tittle;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Spitter(Long id, String login, String tittle, String firstName, String lastName) {
		super();
		this.id = id;
		this.login = login;
		this.tittle = tittle;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
