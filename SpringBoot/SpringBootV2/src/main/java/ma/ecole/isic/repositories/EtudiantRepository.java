package ma.ecole.isic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ecole.isic.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}
