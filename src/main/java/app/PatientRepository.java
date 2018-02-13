package app;

import app.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient,Long> {

    List<Patient> findByLastName(String lastName);
}
