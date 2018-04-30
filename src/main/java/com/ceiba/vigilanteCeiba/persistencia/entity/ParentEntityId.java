package com.ceiba.vigilanteCeiba.persistencia.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntityId implements Serializable{


	private static final long serialVersionUID = 7514585368305386092L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="idIngreso", nullable=false, unique= true)
	private Long idIngreso;

	public Long getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(Long idIngreso) {
		this.idIngreso = idIngreso;
	}

	
}