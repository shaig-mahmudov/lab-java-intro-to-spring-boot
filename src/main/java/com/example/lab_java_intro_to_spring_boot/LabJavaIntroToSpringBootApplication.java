package com.example.lab_java_intro_to_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

import static com.example.lab_java_intro_to_spring_boot.Status.*;

@SpringBootApplication
public class LabJavaIntroToSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabJavaIntroToSpringBootApplication.class, args);


		HashMap<Integer, Patient> patients = new HashMap<>();
		patients.put(1, new Patient(1, "Jaime Jordan", "1984-03-02", 564134));
		patients.put(2, new Patient(2, "Marian Garcia", "1972-01-12", 564134));
		patients.put(3, new Patient(3, "Julia Dusterdieck", "1954-06-11", 356712));
		patients.put(4, new Patient(4, "Steve McDuck", "1931-11-10", 761527));
		patients.put(5, new Patient(5, "Marian Garcia", "1999-02-15", 172456));



	}
}
