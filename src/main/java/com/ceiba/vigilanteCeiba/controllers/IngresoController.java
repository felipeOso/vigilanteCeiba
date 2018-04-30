package com.ceiba.vigilanteCeiba.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.vigilanteCeiba.persistencia.entity.Ingreso;
import com.ceiba.vigilanteCeiba.util.RestResponse;
import com.ceiba.viglanteCeiba.service.IngresoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class IngresoController {
	 protected IngresoService ingresoService;
	 
	 @Autowired
	 protected ObjectMapper mapper;
	 
	 @RequestMapping(value ="/saveOrUpdate", method = RequestMethod.POST)
	 public RestResponse saveOrUpdate(@RequestBody String ingresoJson) throws JsonParseException, JsonMappingException, IOException 
			  {
		 
		 this.mapper = new ObjectMapper();
		 
		 Ingreso ingreso = this.mapper.readValue(ingresoJson, Ingreso.class);
		 
		 if (!this.validate(ingreso)) {
			 return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "el campo placa viene vacio");
		 }
		 
		 this.ingresoService.save(ingreso);
		 return  new RestResponse(HttpStatus.OK.value(), "Operacion Exitosa");
	 }
	 
	 private boolean validate(Ingreso ingreso) {
		 boolean isValid = true;
		 if(ingreso.getPlaca() == null) {
			isValid= false;
		 }
		 return isValid;
	 }
}
