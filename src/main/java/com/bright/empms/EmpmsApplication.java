package com.bright.empms;

import com.bright.empms.model.Employee;
import com.bright.empms.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class EmpmsApplication {

    private final EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmpmsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            employeeRepository.save(new Employee("John", "Doe", "john.doe@gmail.com"));
            employeeRepository.save(new Employee("Jane", "Doe", "jane.doe@gmail.com"));
        };
    }
}
