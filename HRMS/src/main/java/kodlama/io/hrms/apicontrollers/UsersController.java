package kodlama.io.hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.utilities.result.DataResult;
import kodlama.io.hrms.entities.concretes.User;

@RestController
@RequestMapping("api/users")
@CrossOrigin
public class UsersController {

	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getall(){
		return this.userService.getAll();
	}
}
