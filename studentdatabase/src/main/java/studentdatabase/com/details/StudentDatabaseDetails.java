package studentdatabase.com.details;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class StudentDatabaseDetails {
	
	
	@Id
	@Column(name="Rollno")
	private Integer rollNo;
	@Column(name="Fullname")
	private String fullName;
	@Column(name="Department")
	private String department;
	@Column(name="Yearofstudying")
	private Integer yearOfStudying;
	
	
	
	
	public StudentDatabaseDetails(Integer rollNo, String fullName, String department, Integer yearOfStudying) {
		super();
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.department = department;
		this.yearOfStudying = yearOfStudying;
	}






	@Override
	public String toString() {
		return "StudentDatabaseDetails [rollNo=" + rollNo + ", fullName=" + fullName + ", department=" + department
				+ ", yearOfStudying=" + yearOfStudying + "]";
	}
	


	


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Integer getYearOfStudying() {
		return yearOfStudying;
	}


	public void setYearOfStudying(Integer yearOfStudying) {
		this.yearOfStudying = yearOfStudying;
	}
	
	
	
	
	
}
