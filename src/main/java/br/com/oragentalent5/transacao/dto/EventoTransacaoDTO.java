package br.com.oragentalent5.transacao.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EventoTransacaoDTO {
	
	@Id
	private Long idTransacao;
	
    private String id;
    private String valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private String efetivadaEm;

    public EventoTransacaoDTO() {
    }

    public EventoTransacaoDTO(String id, String valor, Estabelecimento estabelecimento, Cartao cartao, String efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public String getEfetivadaEm() {
        return efetivadaEm;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EventoTransacaoDTO [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", estabelecimento=");
		builder.append(estabelecimento);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", efetivadaEm=");
		builder.append(efetivadaEm);
		builder.append("]");
		return builder.toString();
	}
    
    
}
