package Desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.io.FileReader;

public class AnalisadorDados<T> implements DadosParser<T>{
    private final String separador;
    private final Function<String[], T> mapper;

    public AnalisadorDados(String separador, Function<String[], T> mapper) {
        this.separador = separador;
        this.mapper = mapper;
    }

    @Override
    public List<T> parseDados(String arquivo) throws IOException {
        List<T> dados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(separador);
                T dado = mapper.apply(partes);
                dados.add(dado);
            }
        }

        return dados;
    }

}
