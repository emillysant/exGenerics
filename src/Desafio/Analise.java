package Desafio;

import java.util.List;

public interface Analise <T>{
    void processar(String caminhoDocumento);
    List<T> analisar();
}
