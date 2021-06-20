package kodlama.io.hrms.core.utilities.mernis;

public interface MernisService {

	boolean validatePerson(String identityNumber, String firstName, String lastName, int birthOfYear);
	
}
