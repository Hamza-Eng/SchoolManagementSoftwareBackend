package com.gestion.ecole.gestionecole;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gestion.ecole.gestionecole.entities.Centres;
import com.gestion.ecole.gestionecole.entities.Etablissements;
import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;
import com.gestion.ecole.gestionecole.repositories.EtudiantsRepository;

@SpringBootApplication
public class GestionEcoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EtudiantsRepository erepo, EtablissmentsRepository repo,
			CentersRepository centersRepository) {

		return arg -> {
//			List<Etudiants> etudiants= new ArrayList<Etudiants>();
//			etudiants.add(Etudiants.builder().build());
//			etudiants.add(Etudiants.builder().build());
//			etudiants.add(Etudiants.builder().build());

			List<Centres> centres = new ArrayList<>();
			centres.add(Centres.builder().build());
			centres.add(Centres.builder().build());
			centres.add(Centres.builder().build());
			centres.add(Centres.builder().build());

			List<Etablissements> etablissements = new ArrayList<>();
			etablissements.add(Etablissements.builder().banque("9876543218521498").build());
			etablissements.add(Etablissements.builder().build());
			etablissements.add(Etablissements.builder().build());
			etablissements.add(Etablissements.builder().build());

			etablissements.forEach(element -> {

				repo.save(element);
			});
			centres.forEach(element -> {
				element.setEtablissements(etablissements.get(0));
				centersRepository.save(element);
			});

//			Stream.of("azilal", "Beni MElla", "kech").forEach(name -> {
//				Centres centres = new Centres();
//
//				centres.setNomcentre(name);
//				centres.setAdresse(name + "ST , oulbachir");
//				centres.setEmail(name + "@gmail.com");
//				centres.setTel("064584578");
//				centres.setCreatedAt(new Date(22));
//				centres.setUpdatedAt(new Date(56));
//				centersRepository.save(centres);
//			}

//			);

		};
	}

//	@Bean
//	public CorsFilter corsFilter() {
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
//				"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
//				"Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}
}
