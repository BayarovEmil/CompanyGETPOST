package kodlamaio.northwind.buissness.abstracts;

import java.util.List;

import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Company;

public interface CompanyService {
	DataResult<List<Company>> getAll();
	Result add(Company company);
}
