package br.com.oragentalent5.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.oragentalent5.transacao.dto.Cartao;
import br.com.oragentalent5.transacao.dto.Estabelecimento;
import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;

@SpringBootApplication
public class TransacaoApplication implements CommandLineRunner {

	@Autowired
	private TransacaoRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(TransacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cartao cartao = new Cartao("b0012b90-42c8-40e6-903b-64acb3aa649b", "luram.archanjo@zup.com.br");
		Estabelecimento estab = new Estabelecimento("B. A. Ware", "North Winstonbury", "18327 Mills Groves, West Marquita, SD 31244");
		EventoTransacaoDTO evento =  new EventoTransacaoDTO("c63fd0e0-eccb-4af3-9d49-39cde0ffdaf1", "1.4874248222626738", estab, cartao, "2020-08-10T13:16:56");
		repo.save(evento);
	}

}
