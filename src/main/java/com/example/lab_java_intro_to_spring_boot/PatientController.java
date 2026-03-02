package com.example.lab_java_intro_to_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final DataService dataService;

    @Autowired
    public PatientController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public Collection<Patient> getPatients() {
        return dataService.getPatients();
    }
}