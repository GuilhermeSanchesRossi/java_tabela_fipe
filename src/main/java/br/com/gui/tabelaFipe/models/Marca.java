package br.com.gui.tabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Marca(@JsonProperty("codigo") String codigo,
                    @JsonProperty("nome") String nome) { }