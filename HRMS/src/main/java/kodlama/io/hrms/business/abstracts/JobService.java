package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.Job;
import kodlama.io.hrms.core.utilities.result.DataResult;


public interface JobService {

	DataResult<List<Job>> getAll();
   
   
}
