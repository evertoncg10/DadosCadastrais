package br.com.everton.dadoscadastrais.domain;

import br.com.everton.dadoscadastrais.dadoscadastrais.DadosCadastraisStrategy;

public class EnderecoEletronico implements DadosCadastraisStrategy {

    private String nome = "Endereco Eletronico";

    public String getNome() {
        return nome;
    }

    @Override
    public Pessoa gerar(String payload) {
        Pessoa pessoa = new Pessoa();
        pessoa.setEnderecoEletronico(new EnderecoEletronico());
        return pessoa;
    }
}
