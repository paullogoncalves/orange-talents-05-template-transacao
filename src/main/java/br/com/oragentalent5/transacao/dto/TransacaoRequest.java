package br.com.oragentalent5.transacao.dto;

public class TransacaoRequest {

	private String id;
	private String email;
	
	public TransacaoRequest() {
	}

	public TransacaoRequest(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}
	
	
}
