package com.http.tp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.http.tp.classes.Sante;

@RestController
public class SanteController {
@PostMapping("calculeimc")
public String getImc(@RequestParam double poid,double taille)
{
	Sante s=new Sante(poid,taille);
	return s.toString();
	
}
}

