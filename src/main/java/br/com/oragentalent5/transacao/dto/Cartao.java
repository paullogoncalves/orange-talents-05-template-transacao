package br.com.oragentalent5.transacao.dto;

public class Cartao {
    private String id, email;
    
    public Cartao() {
	}

	public Cartao(String id, String email) {
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
