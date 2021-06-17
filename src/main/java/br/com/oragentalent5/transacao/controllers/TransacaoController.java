package br.com.oragentalent5.transacao.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oragentalent5.transacao.TransacaoRepository;
import br.com.oragentalent5.transacao.dto.EventoTransacaoDTO;
import br.com.oragentalent5.transacao.kafkaconfigurations.ListenerDeTransacao;

@RestController
@RequestMapping("/compras")
public class TransacaoController {

	private final Logger logger = LoggerFactory.getLogger(TransacaoController.class);
	@Autowired
	private ListenerDeTransacao listener;

	@Autowired
	private TransacaoRepository repo;

	@GetMapping(path = "/{idCartao}")
	public ResponseEntity<Page<EventoTransacaoDTO>> getTransacao(@PathVariable(name = "idCartao") String idCartao,
			@PageableDefault(size = 10, sort = "efetivadaEm", direction = Direction.DESC) Pageable pageable) {

		Page<EventoTransacaoDTO> transacoes = repo.findByCartaoId(idCartao, pageable);

		if (transacoes.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		logger.info("Log de informação");
		logger.trace("Log de rastreabilidade");
		return ResponseEntity.ok().body(transacoes);
	}

}
