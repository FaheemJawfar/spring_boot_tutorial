package com.faheem.spring_boot_tutorial;

import com.faheem.spring_boot_tutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}


	@GetMapping("/hello")
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Faheem",
						"faheem@gmail.com",
						LocalDate.of(2000, Month.DECEMBER,10),
						28
				)
		);
	}
}
