package org.example.ingressos;

import javax.swing.*;

public class MenuPrincipal {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema de Ingressos");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel titulo = new JLabel("Menu Principal");
        titulo.setBounds(90, 20, 150, 25);
        frame.add(titulo);

        JButton btnIngressos = new JButton("Ingressos");
        btnIngressos.setBounds(70, 60, 150, 30);
        frame.add(btnIngressos);

        JButton btnPublico = new JButton("Público");
        btnPublico.setBounds(70, 100, 150, 30);
        frame.add(btnPublico);

        JButton btnFinanceiro = new JButton("Financeiro");
        btnFinanceiro.setBounds(70, 140, 150, 30);
        frame.add(btnFinanceiro);

        // AÇÕES DOS BOTÕES
        btnIngressos.addActionListener(e -> {
            TelaIngresso.main(null);
        });

        btnPublico.addActionListener(e -> {
            TelaControlePublico.main(null);
        });

        btnFinanceiro.addActionListener(e -> {
            TelaRelatorioFinanceiro.main(null);
        });

        frame.setVisible(true);
    }
}