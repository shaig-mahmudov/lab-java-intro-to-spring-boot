package com.example.lab_java_intro_to_spring_boot;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private final DataService dataService;

	@Autowired
	public EmployeeController(DataService dataService) {
		this.dataService = dataService;
	}

	@GetMapping("/getEmployees")
	public Collection<Employee> getEmployees() {
		return dataService.getAllEmployees();
	}

	@GetMapping("/getDoctorById/{id}")
	public ResponseEntity<Employee> getDoctorById(@PathVariable int id) {
		Employee doctor = dataService.getById(id);
		if(doctor == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(doctor);
	}
}