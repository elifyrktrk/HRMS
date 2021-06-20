package kodlama.io.hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilities.result.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("api/jobSeeker")
@CrossOrigin
public class JobSeekersController {

	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getJobSeeker")
	
	public DataResult<List<JobSeeker>> getall(){
		return this.jobSeekerService.getAll();
	}
}
