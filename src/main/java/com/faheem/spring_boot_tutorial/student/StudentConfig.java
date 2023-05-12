package com.faheem.spring_boot_tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student faheem = new Student(
                    "Faheem",
                    "faheem@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER,10)
            );

            Student ahmed = new Student(
                    "Ahmed",
                    "ahmed@gmail.com",
                    LocalDate.of(2021, Month.APRIL,19)
            );


            repository.saveAll(
                    List.of(faheem, ahmed)
            );

        };
    }
}
