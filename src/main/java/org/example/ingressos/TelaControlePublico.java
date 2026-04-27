package org.example.ingressos;

import javax.swing.*;

public class TelaControlePublico {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Controle de Público");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel lblPartida = new JLabel("Partida:");
        lblPartida.setBounds(30, 30, 100, 25);
        frame.add(lblPartida);

        JLabel valorPartida = new JLabel("Brasil x Argentina");
        valorPartida.setBounds(150, 30, 200, 25);
        frame.add(valorPartida);

        JLabel lblCapacidade = new JLabel("Capacidade:");
        lblCapacidade.setBounds(30, 70, 100, 25);
        frame.add(lblCapacidade);

        JLabel valorCapacidade = new JLabel("50.000");
        valorCapacidade.setBounds(150, 70, 200, 25);
        frame.add(valorCapacidade);

        JLabel lblVendidos = new JLabel("Vendidos:");
        lblVendidos.setBounds(30, 110, 100, 25);
        frame.add(lblVendidos);

        JLabel valorVendidos = new JLabel("32.000");
        valorVendidos.setBounds(150, 110, 200, 25);
        frame.add(valorVendidos);

        JLabel lblAtual = new JLabel("Público atual:");
        lblAtual.setBounds(30, 150, 100, 25);
        frame.add(lblAtual);

        JLabel valorAtual = new JLabel("32.000");
        valorAtual.setBounds(150, 150, 200, 25);
        frame.add(valorAtual);

        frame.setVisible(true);
    }
}