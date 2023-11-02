package ma.ecole.isic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ecole.isic.entities.Employe;
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer>{

}
