package kodlama.io.hrms.core.utilities.mernis;


import org.springframework.stereotype.Service;


@Service
public class MernisVerification implements MernisService {

	@Override
	public boolean validatePerson(String identityNumber, String firstName, String lastName, int birthOfYear) {
	
		return true;
	}
	
}

