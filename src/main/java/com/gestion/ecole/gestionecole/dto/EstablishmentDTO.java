
package com.gestion.ecole.gestionecole.dto;

import java.util.Date;
import java.util.List;

import com.gestion.ecole.gestionecole.entities.establishments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstablishmentDTO {

	public EstablishmentDTO(establishments establishment) {
		super();
		this.id = establishment.getId();
		this.logo = establishment.getLogo();
		this.name = establishment.getName();
		this.adresse = establishment.getAdresse();
		this.ville = establishment.getVille();
		this.email = establishment.getEmail();
		this.descc = establishment.getDescc();
		this.web = establishment.getWeb();
		this.ice = establishment.getIce();
		this.rc = establishment.getRc();
		this.patente = establishment.getPatente();
		this.cnss = establishment.getCnss();
		this.ifs = establishment.getIfs();
		this.tel = establishment.getTel();
		this.portable = establishment.getPortable();
		this.banque = establishment.getBanque();
		this.agence = establishment.getAgence();
		this.rib = establishment.getRib();
		this.image = establishment.getImage();
		this.userId = establishment.getUserId();
		this.createdAt = establishment.getCreatedAt();
		this.updatedAt = establishment.getUpdatedAt();
	}

	private Long id;

	private String logo;

	private String name;

	private String adresse;

	private String ville;

	private String email;

	private String descc;

	private String web;

	private String ice;

	private String rc;

	private String patente;

	private String cnss;

	private String ifs;

	private String tel;

	private String portable;

	private String banque;

	private String agence;

	private String rib;

	private String image;

	private long userId;

	private Date createdAt;

	private Date updatedAt;

	private List<CenterDTO> centres;

}
