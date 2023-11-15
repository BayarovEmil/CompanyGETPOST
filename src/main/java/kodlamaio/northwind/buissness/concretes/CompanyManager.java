package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.CompanyService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.CompanyDao;
import kodlamaio.northwind.entities.concretes.Company;
@Service
public class CompanyManager implements CompanyService{
	private CompanyDao companyDao;
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}
	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<>
		(this.companyDao.findAll(),"Urun listelendi!");
	}
	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult(true,"Urun tapildi!");
	}
	

}
