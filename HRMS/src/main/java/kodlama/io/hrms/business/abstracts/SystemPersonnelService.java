package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.core.utilities.result.DataResult;
import kodlama.io.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {

	DataResult<List<SystemPersonnel>> getAll();
}
