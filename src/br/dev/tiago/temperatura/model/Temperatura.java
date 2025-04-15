package br.dev.tiago.temperatura.model;

public class Temperatura {
	
	private double celsius;

	public double getValorCelcius() {
		return celsius;
	}

	public void setValorCelcius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		
		return (celsius + 273.15);
		
	}
	public double converterParaFahreinheit() {
		
		return (celsius * 9/5) + 32;
	}

}
