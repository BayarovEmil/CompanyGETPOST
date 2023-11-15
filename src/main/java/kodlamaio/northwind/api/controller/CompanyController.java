package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.buissness.abstracts.CompanyService;
import kodlamaio.northwind.core.results.DataResult;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.entities.concretes.Company;

@RestController
@RequestMapping("/api/company")
public class CompanyController {
	private CompanyService companyService;
	@Autowired
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/findData")
	public DataResult<List<Company>> getAll(){
		return this.companyService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Company company) {
		return this.companyService.add(company);
	}
}
