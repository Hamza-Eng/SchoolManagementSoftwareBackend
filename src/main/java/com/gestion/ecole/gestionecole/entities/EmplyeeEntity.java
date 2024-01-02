package com.gestion.ecole.gestionecole.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmplyeeEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id

	private Long id;
	private String name;
	private String Role;
	private String password;
}
