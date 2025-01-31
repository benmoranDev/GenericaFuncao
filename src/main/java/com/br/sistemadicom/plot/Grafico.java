package com.br.sistemadicom.plot;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.List;

public abstract class Grafico extends JFrame {
    protected XYSeriesCollection dataset;

    public Grafico(String titulo, String eixoX, String eixoY, List<XYSeries> seriesList) {
        dataset = new XYSeriesCollection();
        for (XYSeries serie : seriesList) {
            dataset.addSeries(serie);
        }

        JFreeChart chart = ChartFactory.createXYLineChart(
                titulo, eixoX, eixoY, dataset,
                PlotOrientation.VERTICAL, true, true, false
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    protected abstract void plotar();
}