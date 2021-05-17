package br.com.everton.dadoscadastrais.main;

import br.com.everton.dadoscadastrais.dadoscadastrais.*;
import br.com.everton.dadoscadastrais.domain.Pessoa;
import br.com.everton.dadoscadastrais.domain.Telefone;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String payload = "2021-05-17T14:26:30.694484001                    04021234506Everton Cezar Gonçalves";
        String payload2 = "2021-05-17T14:26:30.694484004                    5547996920847";

        Integer type = Integer.valueOf(payload.substring(26,29));
        Integer type2 = Integer.valueOf(payload2.substring(26,29));

        DadosCadastraisEnum dc = DadosCadastraisEnum.getDadosCadastraisPorValor(type);
        DadosCadastraisStrategy dadosCadastraisStrategy = DadosCadastrais.criarDadosCadastraisFactory(dc);
        Pessoa pessoa = DadosCadastrais.gerarDadosCadastrais(dadosCadastraisStrategy, payload);
        System.out.println(pessoa.getDadosPessoais().toString());

        //-----------------------------------------------------------------------------
        DadosCadastraisEnum2 dc2 = DadosCadastraisEnum2.getDadosCadastraisPorValor(type2);
        DadosCadastraisStrategy dadosCadastraisStrategy1 = dc2.criarDadosCadastrais(dc2);
        Pessoa pessoa2 = DadosCadastrais.gerarDadosCadastrais(dadosCadastraisStrategy1, payload2);
        System.out.println(pessoa2.getTelefone().toString());
    }
}
