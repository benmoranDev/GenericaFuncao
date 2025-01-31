package com.br.sistemadicom.utils;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void salvar(String nomeArquivo, String conteudo) {
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write(conteudo);
            System.out.println("Arquivo salvo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}