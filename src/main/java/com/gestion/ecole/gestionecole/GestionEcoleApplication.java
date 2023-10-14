package com.gestion.ecole.gestionecole;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionEcoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CentersRepository centersRepository){

		return arg->{
			Stream.of("azilal", "Beni MElla", "kech").forEach(name->{
				Centres centres = new Centres();

						centres.setNomcentre(name);
						centres.setAdresse(name+ "ST , oulbachir");
						centres.setEmail(name+"@gmail.com");
						centres.setTel("064584578");
						centres.setCreatedAt(new Date(22));
						centres.setUpdatedAt(new Date(56));
				centersRepository.save(centres);
					}


			);

		};
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}
