package com.http.tp.classes;

public class Math {
private int a,b;




public Math() {
}




public int getA() {
	return a;
}




public void setA(int a) {
	this.a = a;
}




public int getB() {
	return b;
}




public void setB(int b) {
	this.b = b;
}




public Math(int a, int b) {
	this.a = a;
	this.b = b;
}




public int somme()
{return this.getA()+this.getB();}
public int  produit()
{
return this.getA()*this.getB();	
}
public double factoriel()
{
double f=1;
for(int i=2;i<=this.getA();i++)
f*=i;
return f;
}
public int calculePgcd()
{
int x=this.getA();
int y=this.getB();
while(x!=y)
{
if(x>y)
	x=x-y;
else
	y=y-x;

}
return x;

}




@Override
public String toString() {
	return "Math [a=" + a + ", b=" + b + ", somme()=" + somme() + ", produit()=" + produit() + ", factoriel()="
			+ factoriel() + ", calculePgcd()=" + calculePgcd() + "]";
}

}
