//me guie utilizando los ejemplos de clase del circulo y triangulo https://github.com/mdelcid/ejemplo/tree/master/diagrama/src/diagrama
public class Rectangulo 
{//base y altura son las variables que creamos
	int base;
	int altura;
	
	Rectangulo(int base, int altura)//hacemos las referencias de base y altura
	{
		this.base = base;
		this.altura = altura;
	}
	int getArea()//hacemos la funcion para obtener el area base*altura
	{//http://www.ditutor.com/geometria/area_rectangulo.html
		return (base*altura);//devuelve el area del rectangulo
	}
	int getPerimetro()//hacemos la funcion para obtener el perimetro 2*(base+altura)
	{//http://www.ditutor.com/geometria/perimetro_rectangulo.html
		return 2*(base+altura);//devuelve el perimetro del rectangulo
	}
	int getBase()//hacemos la funcion para obtener la base
	{
		return base;//devuelve la base del rectangulo
	}
	int getAltura()//hacemos la funcion para obtener la altura
	{
		return altura;//devuelve la altura del rectangulo
	}
	void setBase(int base)
	{
		this.base = base;
	}
	void setAltura(int altura)
	{
		this.altura = altura;
	}

}
