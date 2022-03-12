package com.OOP.studentsystem;

//import com.OOP.studentsystem.fileHandling.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties({
//		FileStorageProperties.class
//})

public class StudentsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}
}
