package studentdatabase.com.details;

import java.util.List;
import java.util.Optional;

public interface StudentDatabaseService {
	
	public List<StudentDatabaseDetails> getall();
	
	public Optional<StudentDatabaseDetails> getDetails(Integer Rollno);
	
	public void addDetails(StudentDatabaseDetails student);
	
	public void updateDetails(StudentDatabaseDetails student);
	
	public void deleteDetails(Integer Rollno); 

}
