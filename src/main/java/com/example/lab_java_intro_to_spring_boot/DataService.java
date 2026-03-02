package com.example.lab_java_intro_to_spring_boot;

import org.springframework.stereotype.Service;

import java.util.*;

import static com.example.lab_java_intro_to_spring_boot.Status.*;
import static com.example.lab_java_intro_to_spring_boot.Status.OFF;
import static com.example.lab_java_intro_to_spring_boot.Status.ON;
import static com.example.lab_java_intro_to_spring_boot.Status.ON_CALL;

@Service
public class DataService {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Map<Integer, Patient> patients = new HashMap<>();

    public DataService() {
        employees.put(356712, new Employee(356712L, "cardiology", "Alonso Flores", ON_CALL));
        employees.put(564134, new Employee(564134L, "immunology", "Sam Ortega", ON));
        employees.put(761527, new Employee(761527L, "cardiology", "German Ruiz", OFF));
        employees.put(166552, new Employee(166552L, "pulmonary", "Maria Lin", ON));
        employees.put(156545, new Employee(156545L, "orthopaedic", "Paolo Rodriguez", ON_CALL));
        employees.put(172456, new Employee(172456L, "psychiatric", "John Paul Armes", OFF));

        patients.put(1, new Patient(1, "Jaime Jordan", "1984-03-02", 564134));
        patients.put(2, new Patient(2, "Marian Garcia", "1972-01-12", 564134));
        patients.put(3, new Patient(3, "Julia Dusterdieck", "1954-06-11", 356712));
        patients.put(4, new Patient(4, "Steve McDuck", "1931-11-10", 761527));
        patients.put(5, new Patient(5, "Marian Garcia", "1999-02-15", 172456));
    }

    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }

    public Collection<Patient> getAllPatients() {
        return patients.values();
    }

    public Employee getById(int id) {
        return employees.get(id);
    }
}