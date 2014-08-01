
public class PentagonoRegular 
{//creamos la variable Lado del pentagono regular
	int Lado;
		
	PentagonoRegular(int Lado)
	{
		this.Lado = Lado;
	}
	int getLado()//hacemos la funcion para obtener el lado
	{
		return Lado;//retornamos lado del pentagono
	}
	void setLado(int Lado)
	{
		this.Lado = Lado;
	}
	int getPerimetro()
	{
		return (Lado*5);//retornamos el perimetro del pentagono
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
