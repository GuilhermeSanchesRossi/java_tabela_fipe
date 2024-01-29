package br.com.gui.tabelaFipe.service;

public interface IConversorDados {
    public <T> T converteDados(String json, Class<T> classe);
}
