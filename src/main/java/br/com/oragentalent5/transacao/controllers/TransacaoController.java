package br.com.oragentalent5.transacao.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oragentalent5.transacao.clients.TransacaoClient;
import br.com.oragentalent5.transacao.configurations.ListenerDeTransacao;
import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;
import br.com.oragentalent5.transacao.dto.TransacaoRequest;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

	//private final Logger logger = LoggerFactory.getLogger(TransacaoController.class);
	@Autowired
	private ListenerDeTransacao listener;
	
	@Autowired
	private TransacaoClient client;
	
    @PostMapping
    public ResponseEntity<EventoTransacaoDTO> getTransacao(@RequestBody TransacaoRequest request) {

    	EventoTransacaoDTO dto = client.getTransacoes(request);
    	
    	listener.ouvir(dto);

//    	logger.info("Log de informação");
//    	logger.trace("Log de rastreabilidade");
        return ResponseEntity.ok().body(dto);
    }

}
