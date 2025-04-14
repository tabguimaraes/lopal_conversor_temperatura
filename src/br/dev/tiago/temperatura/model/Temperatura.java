package br.dev.tiago.temperatura.model;

public class Temperatura {
	
	double celsius = 0;

	public double getCelcius() {
		return celsius;
	}

	public void setCelcius(double celsius) {
		this.celsius = celsius;
	}
	
	public double converterParaKelvin() {
		System.out.println("teste");
		return celsius;
	}
	public double converterParaFahreinheit() {
		System.out.println("teste");
		return celsius;
	}

}
