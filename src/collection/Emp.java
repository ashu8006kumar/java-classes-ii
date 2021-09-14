package collection;

public class Emp {
	private int id;
	private String name;
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Emp(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public int hashCode() { 
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (email == null) {// email is null
			// if other email is null return true else return false;
			return other.email == null;
		} else {
			// email is not null
			if (other.email == null) {
				return false;
			} else {
				return email.equals(other.getEmail());
			}
		}
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
