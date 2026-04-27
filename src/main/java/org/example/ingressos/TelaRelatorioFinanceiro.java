package org.example.ingressos;

import javax.swing.*;

public class TelaRelatorioFinanceiro {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Relatório Financeiro");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel titulo = new JLabel("Resumo Financeiro");
        titulo.setBounds(120, 20, 200, 25);
        frame.add(titulo);

        JLabel lblTotal = new JLabel("Total arrecadado:");
        lblTotal.setBounds(30, 70, 150, 25);
        frame.add(lblTotal);

        JLabel valorTotal = new JLabel("R$ 320.000");
        valorTotal.setBounds(180, 70, 200, 25);
        frame.add(valorTotal);

        JLabel lblIngressos = new JLabel("Ingressos vendidos:");
        lblIngressos.setBounds(30, 110, 150, 25);
        frame.add(lblIngressos);

        JLabel valorIngressos = new JLabel("3.200");
        valorIngressos.setBounds(180, 110, 200, 25);
        frame.add(valorIngressos);

        JLabel lblPartida = new JLabel("Partida:");
        lblPartida.setBounds(30, 150, 150, 25);
        frame.add(lblPartida);

        JLabel valorPartida = new JLabel("Brasil x Argentina");
        valorPartida.setBounds(180, 150, 200, 25);
        frame.add(valorPartida);

        frame.setVisible(true);
    }
}