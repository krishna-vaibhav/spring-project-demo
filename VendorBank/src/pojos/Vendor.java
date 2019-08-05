package pojos;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="vendor1",schema="system")

public class Vendor {
	private Integer id;
	private String name;
	private String email;
	private String city;
	private String   phoneno;
	List<Bank> bank=new ArrayList<>();
	
	
	public Vendor()
	{
		
	}
	
	public Vendor(String name, String email, String city, String phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.phoneno = phoneno;
	}



public Vendor(int id) {
		this.id=id;
	}

@Column(length=30)
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}



@Column(length=30,unique=true)
	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}



	@Column(length=30,unique=true)
	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}



@Column(name="phone_no",length=10)
	public String getPhoneno() {
		return phoneno;
	}




	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
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
		return "Vendor [name=" + name + ", email=" + email + ", city=" + city + ", phoneno=" + phoneno + "]";
	}

	
	@OneToMany(mappedBy="vendor",cascade=CascadeType.ALL)
	public List<Bank> getBank() {
		return bank;
	}

	public void setBank(List<Bank> bank) {
		this.bank = bank;
	}

	
	public void addAccount(Bank b)
	{
		bank.add(b);
		b.setVendor(this);
	}
	
	public void removeAccount(Bank b)
	{
		bank.remove(b);
		b.setVendor(null);
	}
	
	

}
