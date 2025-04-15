package br.dev.tiago.temperatura;

import br.dev.tiago.temperatura.gui.TelaConversor;
import br.dev.tiago.temperatura.model.Temperatura;

public class TemperaturaApp {

	public static void main(String[] args) {

		new TelaConversor().criarTelaConversor();

//		new Temperatura().converterParaFahreinheit();

//		System.out.println(new Temperatura().converterParaKelvin());

	}

}