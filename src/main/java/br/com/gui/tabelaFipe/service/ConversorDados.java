package br.com.gui.tabelaFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConversorDados {

    public static <T> T converteDados(String json, Class<T> classe) {
        ObjectMapper conversor = new ObjectMapper();
        try {
            return conversor.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
