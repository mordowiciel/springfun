package app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    protected Patient() {

    }

    public Patient(String firstName, String last_name) {
        this.firstName = firstName;
        this.lastName = last_name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                '}';
    }
}
