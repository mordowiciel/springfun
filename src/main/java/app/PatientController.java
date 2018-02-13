package app;

import app.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PatientController {

    @Autowired
    PatientRepository repository;

    @RequestMapping("/getall")
    public String getAll() {

        StringBuilder result = new StringBuilder();
        repository.findAll();

        for(Patient patient : repository.findAll()){
            result
                    .append(patient.toString())
                    .append("<br>");
        }
        return result.toString();
    }

    @RequestMapping("/save")
    public String save(){
        repository.save(Arrays.asList(new Patient("Adam", "Johnson"), new Patient("Kim", "Smith"),
                new Patient("David", "Williams"), new Patient("Peter", "Davis")));
        return "Done";
    }
}
