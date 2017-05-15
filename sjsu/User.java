package net.sjsu;
import javax.persistence.*;
@Entity
@Table(name = "User")

public class User {
	
    private String Name;
    private String Address;
    private float Password;
    private long userid;
    
    public User(){
    
    }// defalut constructor
	
    
    @Id
    @Column(name = "Userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public float getPassword() {
		return Password;
	}
	public void setPassword(float password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
    

}
