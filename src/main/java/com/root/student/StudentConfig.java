package com.root.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

/*@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student samir = new Student(
                    "Samir", "Samir.panchal@citi.com", LocalDate.of(1996, 6, 7), 26);
            Student aesha = new Student(
                    "Aesha", "aesha@td.com", LocalDate.of(1996, 1, 1), 26);
            repository.saveAll(List.of(samir, aesha));
        };
    }
}*/
