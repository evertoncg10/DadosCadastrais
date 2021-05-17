package br.com.everton.dadoscadastrais.domain;

import br.com.everton.dadoscadastrais.dadoscadastrais.DadosCadastraisStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DadosPessoais implements DadosCadastraisStrategy {

    private String cpf;
    private String nomeCliente;

    @Override
    public Pessoa gerar(String payload) {
        DadosPessoais dadosPessoais = criarDadosPessoais(payload);
        return criarPessoa(dadosPessoais);
    }

    private DadosPessoais criarDadosPessoais(String payload) {
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.setCpf(payload.substring(49, 60));
        dadosPessoais.setNomeCliente(payload.substring(60, payload.length()));
        return dadosPessoais;
    }

    private Pessoa criarPessoa(DadosPessoais dadosPessoais) {
        Pessoa pessoa = new Pessoa();
        pessoa.setDadosPessoais(dadosPessoais);
        return pessoa;
    }
}
