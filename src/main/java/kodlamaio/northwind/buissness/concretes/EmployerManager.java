package kodlamaio.northwind.buissness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.buissness.abstracts.EmployerService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessDataResult;
import kodlamaio.northwind.core.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployerDao;
import kodlamaio.northwind.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Urun listelendi");
	}
	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(true,"Urun tapildi!");
	}
	

}
