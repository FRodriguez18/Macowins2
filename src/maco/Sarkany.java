package maco;

public class Sarkany implements Marca {

	public double coeficienteMarca(Prenda prenda)
	{
		double precioTasa = prenda.precioConTasa();
		return (precioTasa>500)?1.35:1.10;
	}
	
}
