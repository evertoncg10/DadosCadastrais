package br.com.everton.dadoscadastrais.domain;

import br.com.everton.dadoscadastrais.dadoscadastrais.DadosCadastraisStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Telefone implements DadosCadastraisStrategy {

    private String códigoDDI;
    private String códigoDDD;
    private String numeroTelefone;

    @Override
    public Pessoa gerar(String payload) {
        Telefone telefone = criarTelefone(payload);
        return criarPessoa(telefone);
    }

    private Telefone criarTelefone(String payload) {
        Telefone telefone = new Telefone();
        telefone.setCódigoDDI(payload.substring(49, 51));
        telefone.setCódigoDDD(payload.substring(51, 53));
        telefone.setNumeroTelefone(payload.substring(53, payload.length()));
        return telefone;
    }

    private Pessoa criarPessoa(Telefone telefone) {
        Pessoa pessoa = new Pessoa();
        pessoa.setTelefone(telefone);
        return pessoa;
    }
}
