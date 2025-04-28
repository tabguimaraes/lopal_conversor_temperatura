package br.dev.tiago.temperatura.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.dev.tiago.temperatura.model.Temperatura;

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
        tela.setLayout(null);


        labelCelsius.setBounds(100, 50, 200, 30);
        textCelsius.setBounds(65, 80, 200, 30);
        buttonKelvin.setBounds(65, 110, 80, 30);
        buttonFahreinheit.setBounds(164, 110, 100, 30);
        labelResultado.setBounds(65, 150, 200, 30);
        labelMensagemErro.setBounds(65, 200, 250, 30);

        // Adicionando componentes à tela
        tela.add(textCelsius);
        tela.add(labelCelsius);
        tela.add(buttonKelvin);
        tela.add(buttonFahreinheit);
        tela.add(labelResultado);
        tela.add(labelMensagemErro);

        // Esconde a mensagem de erro inicialmente
        labelMensagemErro.setForeground(Color.RED);
        labelMensagemErro.setVisible(false);

        // Adiciona o ActionListener para o botão "Kelvin"
        buttonKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textCelsius.getText());
                    Temperatura temperatura = new Temperatura();
                    temperatura.setValorCelcius(celsius);
                    double kelvin = temperatura.converterParaKelvin();
                    labelResultado.setText("Resultado: " + kelvin + " K");
                    labelMensagemErro.setVisible(false);
                } catch (NumberFormatException ex) {
                    labelMensagemErro.setVisible(true);
                    labelResultado.setText("Resultado: ");
                }
            }
        });

        // Adiciona o ActionListener para o botão "Fahrenheit"
        buttonFahreinheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textCelsius.getText());
                    Temperatura temperatura = new Temperatura();
                    temperatura.setValorCelcius(celsius);
                    double fahrenheit = temperatura.converterParaFahreinheit();
                    labelResultado.setText("Resultado: " + fahrenheit + " °F");
                    labelMensagemErro.setVisible(false);
                } catch (NumberFormatException ex) {
                    labelMensagemErro.setVisible(true);
                    labelResultado.setText("Resultado: ");
                }
            }
        });

        // Torna a janela visível
        tela.setVisible(true);
    }
}
