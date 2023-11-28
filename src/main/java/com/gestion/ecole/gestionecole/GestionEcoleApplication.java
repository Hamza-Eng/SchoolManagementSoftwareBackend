package com.gestion.ecole.gestionecole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.gestion.ecole.gestionecole.entities.Centers;
import com.gestion.ecole.gestionecole.entities.Classes;
import com.gestion.ecole.gestionecole.entities.Cycles;
import com.gestion.ecole.gestionecole.entities.Employes;
import com.gestion.ecole.gestionecole.entities.Etudiants;
import com.gestion.ecole.gestionecole.entities.Filieres;
import com.gestion.ecole.gestionecole.entities.Niveaux;
import com.gestion.ecole.gestionecole.entities.establishments;
import com.gestion.ecole.gestionecole.repositories.CentersRepository;
import com.gestion.ecole.gestionecole.repositories.ClassesRepository;
import com.gestion.ecole.gestionecole.repositories.CyclesRepository;
import com.gestion.ecole.gestionecole.repositories.EtablissmentsRepository;
import com.gestion.ecole.gestionecole.repositories.EtudiantsRepository;
import com.gestion.ecole.gestionecole.repositories.FilieresRepository;
import com.gestion.ecole.gestionecole.repositories.NiveauxRepository;

@SpringBootApplication
public class GestionEcoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionEcoleApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EtudiantsRepository erepo, EtablissmentsRepository repo,
			CentersRepository centersRepository, CyclesRepository cyclesRepository,
			FilieresRepository filieresRepository, NiveauxRepository niveauxRepository,
			ClassesRepository classesRepository, EtudiantsRepository etudiantsRepository) {

		return arg -> {

//			Etablissements etablissements2 = new Etablissements();
//
//	        // Use ObjectMapper to convert the object to JSON
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        String json = objectMapper.writeValueAsString(etablissements2);

			// Print the JSON
//	        System.out.println(json);

//			List<Etudiants> etudiants= new ArrayList<Etudiants>();
//			etudiants.add(Etudiants.builder().build());
//			etudiants.add(Etudiants.builder().build());
//			etudiants.add(Etudiants.builder().build());

			List<Centers> centres = new ArrayList<>();
			centres.add(Centers.builder().build());
			centres.add(Centers.builder().build());
			centres.add(Centers.builder().build());
			centres.add(Centers.builder().build());

			List<establishments> etablissements = new ArrayList<>();
			etablissements.add(establishments.builder().banque("9876543218521498").adresse("azilal").build());
			etablissements.add(establishments.builder().build());
			etablissements.add(establishments.builder().build());
			etablissements.add(establishments.builder().build());

			List<Employes> employes = new ArrayList<>();
			employes.add(Employes.builder().build());
			employes.add(Employes.builder().build());
			employes.add(Employes.builder().build());
			employes.add(Employes.builder().build());

			List<Cycles> cycles = new ArrayList<>();
			cycles.add(Cycles.builder().build());
			cycles.add(Cycles.builder().build());
			cycles.add(Cycles.builder().build());
			cycles.add(Cycles.builder().build());

			List<Filieres> filieres = new ArrayList<>();
			filieres.add(Filieres.builder().build());
			filieres.add(Filieres.builder().build());
			filieres.add(Filieres.builder().build());
			filieres.add(Filieres.builder().build());

			List<Niveaux> niveaux = new ArrayList<>();
			niveaux.add(Niveaux.builder().build());
			niveaux.add(Niveaux.builder().build());
			niveaux.add(Niveaux.builder().build());
			niveaux.add(Niveaux.builder().build());

			List<Classes> classes = new ArrayList<>();
			classes.add(Classes.builder().nom("primary 2").anneeUniver(new Date(2022)).numero("12").etudiants(new ArrayList<>())
					.niveaux(new Niveaux()).build());
			classes.add(Classes.builder().nom("primary 3").build());
			classes.add(Classes.builder().build());
			classes.add(Classes.builder().build());

			List<Etudiants> etudiants = new ArrayList<>();
			etudiants.add(Etudiants.builder().nom("ahmed").build());
			etudiants.add(Etudiants.builder().build());
			etudiants.add(Etudiants.builder().build());
			etudiants.add(Etudiants.builder().build());

			etablissements.forEach(element -> {

				repo.save(element);
			});
			centres.forEach(element -> {
				element.setEtablissements(etablissements.get(0));
				centersRepository.save(element);
			});

			cycles.forEach(elem -> {
				elem.setCentre(centres.get(0));
				cyclesRepository.save(elem);
			});
			filieres.forEach(element -> {
				element.setCycle(cycles.get(0));
				filieresRepository.save(element);
			});
			niveaux.forEach(elem -> {
				elem.setFiliere(filieres.get(1));
				niveauxRepository.save(elem);
			});
			classes.forEach(elem -> {
				elem.setNiveaux(niveaux.get(0));
				classesRepository.save(elem);
			});
			etudiants.forEach(elem -> {
				elem.setClasse(classes.get(0));
				etudiantsRepository.save(elem);
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

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
				"Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}
