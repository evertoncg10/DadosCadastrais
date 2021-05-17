package br.com.everton.dadoscadastrais.dadoscadastrais;

import java.util.HashMap;
import java.util.Map;

public enum DadosCadastraisEnum {
    DADOS_PESSOAIS(001),
    ENDERECO(002),
    ENDERECO_ELETRONICO(003),
    TELEFONE(004);

    private Integer valor;

    private static final Map<Integer, DadosCadastraisEnum> dadosCadastraisPorValor = new HashMap<>();

    static {
        for (DadosCadastraisEnum dadosCadastrais : DadosCadastraisEnum.values()) {
            dadosCadastraisPorValor.put(dadosCadastrais.getValor() , dadosCadastrais);
        }
    }

    DadosCadastraisEnum(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static DadosCadastraisEnum getDadosCadastraisPorValor(Integer valor) {
        return dadosCadastraisPorValor.get(valor);
    }
}
