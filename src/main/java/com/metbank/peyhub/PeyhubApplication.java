package com.metbank.peyhub;

import com.metbank.peyhub.document.*;
import com.metbank.peyhub.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PeyhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeyhubApplication.class, args);
	}

	/*
		// creating a user
	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			Email email = new Email(
					"theotakumug@gmail.com",
					false
			);
			Phone phone = new Phone(
					"+237737155613",
					false
			);
			Address address = new Address(
					"00263",
					"Zimbabwe",
					"Mashonaland West",
					"Harare",
					"Brentwood",
					"15"
			);
			User user = new User(
					"Theophilus",
					"Muganhu",
					email,
					phone,
					Gender.Male,
					address,
					LocalDateTime.now(),
					LocalDateTime.now(),
					Status.active,
					List.of("Food", "Gadgets")


			);

			userRepository.save(user);

		};
	}
	 */
}
