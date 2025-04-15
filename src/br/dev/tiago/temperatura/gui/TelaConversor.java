package br.dev.tiago.temperatura.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConversor {

	private JTextField textCelsius = new JTextField();
	private JLabel labelCelsius = new JLabel("Temperatura em Celsius:");
	private JButton buttonKelvin = new JButton("Kelvin");
	private JButton buttonFahreinheit = new JButton("Fahrenheit");
	private JLabel labelResultado = new JLabel("Resultado: ");
	private JLabel labelMensagemErro = new JLabel("Por favor insira um número válido.");

	public void criarTelaConversor() {

		JFrame tela = new JFrame("Conversor de Temperatura");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(350, 350);
//        tela.setLayout(new FlowLayout());
		tela.add(textCelsius);
		tela.add(labelCelsius);
		tela.add(buttonKelvin);
		tela.add(buttonFahreinheit);
		tela.add(labelResultado);
//        tela.add(labelMensagemErro);

//        Posicionamento ainda não está 100%
		
		labelCelsius.setBounds(100, 50, 200, 30);
		textCelsius.setBounds(65, 80, 200, 30);
		buttonKelvin.setBounds(65, 110, 80, 30);
		buttonFahreinheit.setBounds(164, 110, 100, 30);
		labelResultado.setBounds(164, 150, 100, 30);
		labelMensagemErro.setBounds(164, 150, 100, 30);

		tela.setVisible(true);

	}

}
