package ar.edu.unlam.tallerweb;

public class Anillo {
	Double radioExterior;
	Double radioInterior;
	Double pi=3.14;
	Double resultado;
	
	public Double perimetroDelCirculoExterior(Double radio){
		return radioExterior = pi*2*radio;
	}
	
	public Double perimetroDelCirculoInterior(Double radio){
		return radioInterior = pi*2*radio;
	}
	
	public Double AreaDelCirculo(Double radioExterior, Double radioInterior) {
		return resultado = pi*(Math.pow(radioExterior,2)-Math.pow(radioInterior,2));
	}
	
	
}

/* 
tp 1 entregar al profe ismael esta en miel
tarea 1 buscar info sobre ACID relacionado con los test
tarea 2 hacer cuadrado y triangulo de a dos a traves de git
*/