package com.firstSpringBoot.firstSpringBoot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.firstSpringBoot.firstSpringBoot.beans.Student;

@RestController
public class StudentController {
	
	public static List<Student> students=new ArrayList<>();
	
	public StudentController() {
		students.add(new Student("Hellow","World"));
		students.add(new Student("Raja","Ratha"));
		students.add(new Student("Rani","Jayakumar"));
		students.add(new Student("Hari","Jayakumar"));
		students.add(new Student("Jayakumar","Ranganath"));
		students.add(new Student("Cat","Pet"));
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return students;
	}
	
//	path variable used to read form URL
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathName(@PathVariable("firstName") String firtsName,@PathVariable("lastName") String lastName) {
		return new Student(firtsName, lastName);
	}
	
// we use query params to take data form Url
	@GetMapping("student/query")
	public Student StudentQuery(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	@PostMapping("add-student")
	public String addStudent(@RequestBody Student student) {
		students.add(student);
		return "Added SuccessFully";
	}
	
	@PutMapping("update-student/{firstName}")
	public String updateStudent(@PathVariable("firstName") String firstName,@RequestBody Student student) {
		for(Student st:students) {
			if(st.getFirstName().equals(firstName)) {
				st.setFirstName(student.getFirstName());
				st.setLastName(student.getLastName());
				break;
			}
		}
		return "updated successfully";
	}
	
	@DeleteMapping("delete-student/{firstName}")
	public String deleteStudent(@PathVariable("firstName") String firstName) {
		for(Student st:students) {
			if(st.getFirstName().equals(firstName)) {
				students.remove(st);				break;
			}
		}
		return "deleted successfully";
	}
	
	
}
