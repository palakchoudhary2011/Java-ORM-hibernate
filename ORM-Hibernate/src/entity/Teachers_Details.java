package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="teacher_details")

public class Teachers_Details {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="city")
	private String city;
	@Column(name="hobby")
	private String hobby;
	
	// For one to one bi directional mapping 
	@OneToOne(mappedBy = "teacherDetails",  cascade = CascadeType.ALL)
	private Teacher teacher;
	
	
	public Teachers_Details() {
		// TODO Auto-generated constructor stub
	}

	public Teachers_Details(String city, String hobby) {
		this.city = city;
		this.hobby = hobby;
	}
	
	public Teacher getTeachers() {
		return teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Teachers_Details [id=" + id + ", city=" + city + ", hobby=" + hobby + "]";
	}
	
	
	
	
}
