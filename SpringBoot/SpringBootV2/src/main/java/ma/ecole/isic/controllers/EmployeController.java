package ma.ecole.isic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ecole.isic.entities.Employe;
import ma.ecole.isic.repositories.EmployeRepository;


@RestController
@RequestMapping("/api/employees")
public class EmployeController {
	@Autowired
	private EmployeRepository employeRepository;
	
	
	@PostMapping("/save")
	public Employe save(@RequestBody Employe e) {
		return employeRepository.save(e);
	}
	
	@GetMapping("/all")
	public List<Employe> findAll(){	
		return employeRepository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		employeRepository.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public Employe update(@PathVariable int id, @RequestBody Employe newEmploye) {
		 newEmploye.setId(id); 
		 return employeRepository.save(newEmploye);
	}

}
