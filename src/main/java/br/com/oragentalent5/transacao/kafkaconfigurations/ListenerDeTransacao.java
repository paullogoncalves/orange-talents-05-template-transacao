package br.com.oragentalent5.transacao.kafkaconfigurations;

import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(EventoTransacaoDTO eventoDeTransacao) {
        System.out.println(eventoDeTransacao);
    }

}

