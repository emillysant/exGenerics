package Desafio;

import java.io.IOException;
import java.util.List;

public interface DadosParser<T> {
    List<T> parseDados(String arquivo) throws IOException;
}
