package br.com.gui.tabelaFipe;

import br.com.gui.tabelaFipe.models.Marca;
import br.com.gui.tabelaFipe.service.ConsumoAPI;
import br.com.gui.tabelaFipe.service.ConversorDados;

import java.util.Arrays;

public class TabelaFipeApp {
    public static void main(String[] args) {
        String urlMarca = "https://parallelum.com.br/fipe/api/v1/carros/marcas";
        String json = ConsumoAPI.obterDados(urlMarca);
        var listaMarcas = ConversorDados.converteDados(json, Marca[].class);
        System.out.println(Arrays.toString(listaMarcas));
    }
}
