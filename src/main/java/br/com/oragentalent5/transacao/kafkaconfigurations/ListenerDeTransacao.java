package br.com.oragentalent5.transacao.kafkaconfigurations;

import br.com.oragentalent5.transacao.TransacaoRepository;
import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {
	@Autowired
	private TransacaoRepository repo;
	
    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoTransacaoDTO eventoTransacao) {
    	repo.save(eventoTransacao);
        System.out.println(eventoTransacao);
        
    }

}

