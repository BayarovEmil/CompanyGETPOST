package kodlamaio.northwind.buissness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
