package br.com.everton.dadoscadastrais.dadoscadastrais;

import br.com.everton.dadoscadastrais.domain.DadosPessoais;
import br.com.everton.dadoscadastrais.domain.Endereco;
import br.com.everton.dadoscadastrais.domain.EnderecoEletronico;
import br.com.everton.dadoscadastrais.domain.Telefone;

import java.util.HashMap;
import java.util.Map;

public enum DadosCadastraisEnum2 {
    DADOS_PESSOAIS(001){
        @Override
        public DadosCadastraisStrategy criarDadosCadastrais(DadosCadastraisEnum2 tipo) {
            return new DadosPessoais();
        }
    },
    ENDERECO(002) {
        @Override
        public DadosCadastraisStrategy criarDadosCadastrais(DadosCadastraisEnum2 tipo) {
            return new Endereco();
        }
    },
    ENDERECO_ELETRONICO(003) {
        @Override
        public DadosCadastraisStrategy criarDadosCadastrais(DadosCadastraisEnum2 tipo) {
            return new EnderecoEletronico();
        }
    },
    TELEFONE(004) {
        @Override
        public DadosCadastraisStrategy criarDadosCadastrais(DadosCadastraisEnum2 tipo) {
            return new Telefone();
        }
    };

    private Integer valor;

    private static final Map<Integer, DadosCadastraisEnum2> dadosCadastraisPorValor = new HashMap<>();

    static {
        for (DadosCadastraisEnum2 dadosCadastrais : DadosCadastraisEnum2.values()) {
            dadosCadastraisPorValor.put(dadosCadastrais.getValor() , dadosCadastrais);
        }
    }

    DadosCadastraisEnum2(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static DadosCadastraisEnum2 getDadosCadastraisPorValor(Integer valor) {
        return dadosCadastraisPorValor.get(valor);
    }

    public abstract DadosCadastraisStrategy criarDadosCadastrais(DadosCadastraisEnum2 tipo);
}
