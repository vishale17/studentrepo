package studentdatabase.com.details;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentDatabaseServiceImplementation implements StudentDatabaseService {
	
	@Autowired
	private StudentDatabaseCrudRepo repo;
	
	
	public List<StudentDatabaseDetails> getall(){
		List<StudentDatabaseDetails> student=new ArrayList<>();
		repo.findAll().forEach(student::add);
		return student;
	}
	
	
	public Optional<StudentDatabaseDetails> getDetails(Integer Rollno)
	{
		return repo.findById(Rollno);
	}
	

	public void addDetails(StudentDatabaseDetails student) 
	{
		repo.save(student);
	}
	

	public void updateDetails(StudentDatabaseDetails student)
	{
		repo.save(student);
	}

	
	public void deleteDetails(Integer Rollno) 
	{
		
		repo.deleteById(Rollno);
	}
	
	
	
}
