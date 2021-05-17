package br.com.everton.dadoscadastrais.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pessoa {

    private DadosPessoais dadosPessoais;
    private Endereco endereco;
    private EnderecoEletronico enderecoEletronico;
    private Telefone telefone;
}
