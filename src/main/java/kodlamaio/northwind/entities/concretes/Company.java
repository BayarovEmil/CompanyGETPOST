package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="company")
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="company_id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site")
	private String website;
	@Column(name="email")
	private String email;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="password1")
	private String password1;
	
	@Column(name="password2")
	private String password2;
}
