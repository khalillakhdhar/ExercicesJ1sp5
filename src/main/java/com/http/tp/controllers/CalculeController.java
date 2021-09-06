package com.http.tp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.http.tp.classes.Mathematique;
@RestController
public class CalculeController {
@PostMapping("calculemath")
public String getCalcule(@RequestParam int v1,int v2)
{
Mathematique m=new 	Mathematique(v1, v2);
return m.toString();
}
}
