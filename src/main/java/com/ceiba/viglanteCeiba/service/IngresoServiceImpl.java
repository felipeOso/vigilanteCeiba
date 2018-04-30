package com.ceiba.viglanteCeiba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.vigilanteCeiba.dao.IngresoRepository;
import com.ceiba.vigilanteCeiba.persistencia.entity.Ingreso;

@Service
public class IngresoServiceImpl implements IngresoService {

	@Autowired
	protected IngresoRepository ingresoRepository;
	
	@Override
	public Ingreso save(Ingreso ingreso) {
		return this.ingresoRepository.save(ingreso);
	}
	
}
