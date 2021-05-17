package br.com.everton.dadoscadastrais.domain;

import br.com.everton.dadoscadastrais.dadoscadastrais.DadosCadastraisStrategy;

public class Endereco implements DadosCadastraisStrategy {
    private String nome = "Endereco";

    public String getNome() {
        return nome;
    }

    @Override
    public Pessoa gerar(String payload) {
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco(new Endereco());
        return pessoa;
    }
}
