package kodlama.io.hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.SystemPersonnelService;
import kodlama.io.hrms.core.utilities.result.DataResult;
import kodlama.io.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("api/systemPersonnels")
@CrossOrigin
public class SystemPersonnelsController {

	private SystemPersonnelService systemPersonnelService;
	
	@Autowired
	public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
		super();
		this.systemPersonnelService = systemPersonnelService;
	}
	@GetMapping("/getSystemPersonnels")
	public DataResult<List<SystemPersonnel>> getall(){
		return this.systemPersonnelService.getAll();
		}
}