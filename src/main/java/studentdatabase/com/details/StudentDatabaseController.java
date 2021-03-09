package studentdatabase.com.details;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentDatabaseController {
	
	@Autowired
	private StudentDatabaseService service;
	
	
	@GetMapping(value="/studentdetails")
	public List<StudentDatabaseDetails> getall()
	{
		return service.getall();
	}
	
	
	@GetMapping(value="/studentdetails/{Rollno}")
	public Optional<StudentDatabaseDetails> getDetails(@PathVariable Integer Rollno)
	{
		return service.getDetails(Rollno);
	}
	
	
	@PostMapping(value="/studentdetails")
	public void addDetails(@RequestBody StudentDatabaseDetails student)
	{
		
		service.addDetails(student);
	}
	
	
	@PutMapping(value="/studentdetails/{Rollno}")
	public void updateDetails(@RequestBody StudentDatabaseDetails student)
	{
		service.updateDetails(student);
	}
	
	
	@DeleteMapping(value="/studentdetails/{Rollno}")
	public void deleteDetails(@PathVariable Integer Rollno)
	{
		service.deleteDetails(Rollno);
	}
	
	
	
	
}