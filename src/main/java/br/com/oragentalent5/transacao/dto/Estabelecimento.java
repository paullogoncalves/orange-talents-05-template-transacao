package br.com.oragentalent5.transacao.dto;

public class Estabelecimento {
    private String nome, cidade, endereco;
    
    public Estabelecimento() {
		
	}

	public Estabelecimento(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estabelecimento [nome=");
		builder.append(nome);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
    
	
    
}
