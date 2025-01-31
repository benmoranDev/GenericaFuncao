package com.br.sistemadicom.ui;

import com.br.sistemadicom.plot.GraficoDerivada;
import com.br.sistemadicom.plot.GraficoFuncao;
import com.br.sistemadicom.plot.GraficoIntegral;
import com.br.sistemadicom.plot.GraficoMultiplo;
import com.br.sistemadicom.utils.Arquivo;

import javax.swing.*;
import java.awt.*;


public class JanelaPrincipal extends JFrame {
    private JTextField campoA, campoB, campoN;

    public JanelaPrincipal() {
        setTitle("Cálculo Numérico - Engenharia da Computação");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        JButton btnFuncao = new JButton("Gráfico da Função");
        JButton btnDerivada = new JButton("Gráfico da Derivada");
        JButton btnIntegral = new JButton("Gráfico da Integral");
        JButton btnMultiGrafico = new JButton("Gráfico Múltiplo");
        JButton btnSalvar = new JButton("Salvar Resultados");

        campoA = new JTextField("0");
        campoB = new JTextField("3.14");
        campoN = new JTextField("1000");

        add(new JLabel("Intervalo A:"));
        add(campoA);
        add(new JLabel("Intervalo B:"));
        add(campoB);
        add(new JLabel("Número de Partições (n):"));
        add(campoN);
        add(btnFuncao);
        add(btnDerivada);
        add(btnIntegral);
        add(btnMultiGrafico);
        add(btnSalvar);

        btnFuncao.addActionListener(e -> new GraficoFuncao());
        btnDerivada.addActionListener(e -> new GraficoDerivada());
        btnIntegral.addActionListener(e -> {
            double a = Double.parseDouble(campoA.getText());
            double b = Double.parseDouble(campoB.getText());
            int n = Integer.parseInt(campoN.getText());
            new GraficoIntegral(a, b, n);
        });

        btnMultiGrafico.addActionListener(e -> GraficoMultiplo.exibir());
        btnSalvar.addActionListener(e -> {
            Arquivo.salvar("resultados.txt", "Cálculos salvos!");
            JOptionPane.showMessageDialog(this, "Resultados salvos!");
        });

        setVisible(true);
    }
}