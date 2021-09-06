package com.http.tp.classes;

public class Sante {
private double poid,taille;

public double getPoid() {
	return poid;
}

public void setPoid(double poid) {
	this.poid = poid;
}

public double getTaille() {
	return taille;
}

public void setTaille(double taille) {
	this.taille = taille;
}

public Sante(double poid, double taille) {
	this.poid = poid;
	this.taille = taille;
}

public Sante() {
}
public int calculateimc()
{
double indice=this.getPoid()/(Math.pow(this.getTaille(),2));
return (int) Math.round(indice);
}
public String evaluateIMC()
{
if(this.calculateimc()<20)
	return "maigre";
else if(this.calculateimc()<=25)
	return "idéal";
else
	return "surpoid";

}

@Override
public String toString() {
	return "Sante [poid=" + poid + ", taille=" + taille + ", calculateimc()=" + calculateimc() + ", evaluateIMC()="
			+ evaluateIMC() + "]";
}




}
