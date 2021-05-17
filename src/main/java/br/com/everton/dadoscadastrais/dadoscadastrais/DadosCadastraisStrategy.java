package br.com.everton.dadoscadastrais.dadoscadastrais;

import br.com.everton.dadoscadastrais.domain.Pessoa;

public interface DadosCadastraisStrategy {
    Pessoa gerar(String payload);

}
