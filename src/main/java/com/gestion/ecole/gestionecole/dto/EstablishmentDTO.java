
package com.gestion.ecole.gestionecole.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstablishmentDTO {

	private Long id;
	private String name;
	private String email;
	private String ice;
	private List<CenterDTO> centres;


}
