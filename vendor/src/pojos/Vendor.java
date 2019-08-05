package pojos;
import javax.persistence.*;

@Entity
@Table(name="vendor",schema="system")

public class Vendor {
	private Integer id;
	private String name;
	private String email;
	private String city;
	private String   phone_no;
	
	public Vendor(String name, String email, String city, String phone_no) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.phone_no = phone_no;
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




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getPhoneno() {
		return phone_no;
	}




	public void setPhoneno(String phone_no) {
		this.phone_no = phone_no;
	}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)


	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	@Override
	public String toString() {
		return "Vendor [name=" + name + ", email=" + email + ", city=" + city + ", phone_no=" + phone_no + "]";
	}

	
	

}
