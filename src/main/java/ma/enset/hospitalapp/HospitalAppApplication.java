package ma.enset.hospitalapp;

import ma.enset.hospitalapp.entities.Patient;
import ma.enset.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class HospitalAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }
    @Bean
	PasswordEncoder passwordEncoder() 
	{
		return new BCryptPasswordEncoder();
	}
}
