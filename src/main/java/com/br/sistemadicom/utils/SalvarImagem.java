package com.br.sistemadicom.utils;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartUtils;

import java.io.File;
import java.io.IOException;

public class SalvarImagem {
    public static void salvar(JFreeChart chart, String nomeArquivo) {
        try {
            ChartUtils.saveChartAsPNG(new File(nomeArquivo), chart, 800, 600);
            System.out.println("Imagem salva como " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar imagem: " + e.getMessage());
        }
    }
}