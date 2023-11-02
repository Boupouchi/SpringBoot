package ma.ecole.isic.controllers;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ecole.isic.entities.Etudiant;
import ma.ecole.isic.repositories.EtudiantRepository;

@RestController
@RequestMapping("/api/students")
public class EtudiantController {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	
	@PostMapping("/save")
	public Etudiant save(@RequestBody Etudiant e) {
		return etudiantRepository.save(e);
	}
	
	@GetMapping("/all")
	public List<Etudiant> findAll(){	
		return etudiantRepository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		 etudiantRepository.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public Etudiant update(@PathVariable int id, @RequestBody Etudiant newEtudiant) {
		 newEtudiant.setId(id); 
		 return etudiantRepository.save(newEtudiant);
	}
}
