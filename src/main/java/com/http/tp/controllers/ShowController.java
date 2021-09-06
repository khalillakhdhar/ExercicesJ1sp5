package com.http.tp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShowController {
@GetMapping("")
public ModelAndView getHomePage()
{
ModelAndView accueil=new ModelAndView("home.html");
return accueil;

}
@GetMapping("math")
public ModelAndView getCalcule()
{
ModelAndView calculator=new ModelAndView("calcule.html");
return calculator;
}
@GetMapping("sante")
public ModelAndView getIndice()
{
ModelAndView sante=new ModelAndView("indice.html");
return sante;
}
}
