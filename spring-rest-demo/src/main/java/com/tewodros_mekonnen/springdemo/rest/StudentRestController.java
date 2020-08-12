package com.tewodros_mekonnen.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tewodros_mekonnen.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> newStudents;
	
	
	// define @PostConstruct to load the student data... only once
	// if having an issue importing @PostConstruct imports, add pom.xml dependency
	@PostConstruct
	public void loadData() {
		newStudents = new ArrayList<Student>();
		
		newStudents.add(new Student("Tewodros", "Tadesse"));
		newStudents.add(new Student("Melkam", "Mekonnen"));
		newStudents.add(new Student("Kalkidan", "Tadesse"));
		
	}

	

	/* instead of doing like below, it is better to separate this code. see top and bottom codes for difference!
	 * @GetMapping("/students") 
	 * public List<Student> getStudents() {
	 * 
	 * List<Student> newStudents = new ArrayList<Student>();
	 * 
	 * newStudents.add(new Student("Tewodros", "Mekonnen")); 
	 * newStudents.add(new Student("Kalkidan", "Mekonnen")); 
	 * newStudents.add(new Student("Melkam", "Tadesse"));
	 * 
	 * 
	 * return newStudents; }
	 */
	
	
	// define end-point for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return newStudents;
	}
	
	
	// to return a single student
	// define end-point for "/students/{studentId}" - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		// here we are just returning the student at an index, later we will use a database
		return newStudents.get(studentId);
	}

}
 