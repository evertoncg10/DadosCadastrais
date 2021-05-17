package br.com.everton.dadoscadastrais.dadoscadastrais;

import br.com.everton.dadoscadastrais.domain.*;

public class DadosCadastrais {

    public static Pessoa gerarDadosCadastrais(DadosCadastraisStrategy dadosCadastraisStrategy, String payload) {
        return dadosCadastraisStrategy.gerar(payload);
    }

    public static DadosCadastraisStrategy criarDadosCadastraisFactory(DadosCadastraisEnum tipo){
        DadosCadastraisStrategy dadosCadastraisStrategy = null;
        switch(tipo) {
            case DADOS_PESSOAIS:
                dadosCadastraisStrategy = new DadosPessoais();
                break;
            case ENDERECO:
                dadosCadastraisStrategy = new Endereco();
                break;
            case ENDERECO_ELETRONICO:
                dadosCadastraisStrategy = new EnderecoEletronico();
                break;
            case TELEFONE:
                dadosCadastraisStrategy = new Telefone();
                break;
            default:
                // code block
        }
        return dadosCadastraisStrategy;
    }
}
